package main;

import main.examTickets.ExamService;
import main.examTickets.ExamTicketsManager;
import main.tickets.*;
import main.topicTickets.*;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.*;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;


import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class TestBot extends TelegramLongPollingBot {
    Integer count = 0;
    @Override
    public String getBotUsername() {
        return "qPDDbot";
    }

    @Override
    public String getBotToken() {
        return "5438466239:AAGpuBa2yTpLds1_X9L4YN0tOKyAc5iDzj8";
    }

    @Override
    public void onUpdateReceived(Update update){
        if (update.hasCallbackQuery()) {
            String data = update.getCallbackQuery().getData();
            AnswersService answersService = new AnswersService(update.getCallbackQuery());
            HelpService helpService = new HelpService(update.getCallbackQuery());
            ExamService examService = new ExamService(update.getCallbackQuery());
            try {
                handleCallback(update.getCallbackQuery());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }

            if(data.matches("(.*)Fir(.*)") || data.matches("(.*)Sec(.*)") || data.matches("(.*)Th(.*)") || data.matches("(.*)Fo(.*)")) {
                try {
                    execute(answersService.getAnswer());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(data.matches("(.*)Right(.*)")) {
                try {
                    execute(answersService.deleteMessage());
                    execute(answersService.getQuestion());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(data.matches("(.*)Help(.*)")) {
                try {
                    execute(helpService.helpCaption());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(data.matches("(.*)Last(.*)")) {
                try {
                    execute(answersService.deleteMessage());
                    execute(answersService.infoMessage());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(data.matches("(.*)Ticketlast(.*)")){
                try {
                    execute(answersService.deleteMessage());
                    execute(answersService.infoTicketMessage());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }


            else if(data.matches("(.*)Answer(.*)")){
                try {
                    execute(answersService.deleteMessage());
                    execute(examService.getQuestion());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            else if(data.matches("(.*)True(.*)")) {
                try {
                    execute(answersService.deleteMessage());
                    execute(examService.getQuestion());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                count++;
            }
            else if(data.matches("(.*)Result(.*)")) {
                count++;
                try {
                    execute(answersService.deleteMessage());
                    String ans;
                    if(count > 18) {
                        ans = String.format("Вы ответили правильно на %s из 20 вопросов и успешно сдали экзамен! ☺️" +
                                "Чтобы выйти в главное меню введите /start", count);
                    }
                    else {
                        ans = String.format("Вы ответили правильно на %s из 20 вопросов и не сдали экзамен \uD83D\uDE14 " +
                                "Потренируйтесь и возвращайтесь снова. Чтобы выйти в главное меню введите /start", count);
                    }
                    execute(SendMessage.builder().chatId(update.getCallbackQuery().getMessage().getChatId().toString()).text(ans).build());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                count = 0;
            }
            else if(data.matches("(.*)Least(.*)")) {
                try {
                    execute(answersService.deleteMessage());
                    String ans;
                    if(count > 18) {
                        ans = String.format("Вы ответили правильно на %s из 20 вопросов и успешно сдали экзамен! ☺️" +
                                " Чтобы выйти в главное меню введите /start", count);
                    }
                    else {
                        ans = String.format("Вы ответили правильно на %s из 20 вопросов и не сдали экзамен \uD83D\uDE14 " +
                                "Потренируйтесь и возвращайтесь снова. Чтобы выйти в главное меню введите /start", count);
                    }
                    execute(SendMessage.builder().chatId(update.getCallbackQuery().getMessage().getChatId().toString()).text(ans).build());
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                count = 0;
            }


        } else if (update.hasMessage()) {
            Message message = update.getMessage();
            Long chat_id = update.getMessage().getChatId();
            String data = update.getMessage().getText();
            try {
                execute(new StartBotCommand(chat_id, message, data, update.getCallbackQuery()).getAnswer());
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    private void handleCallback(CallbackQuery callbackQuery) throws TelegramApiException {
        TicketsManager ticketsManager = new TicketsManager();
        TopicTickets topicTickets = new TopicTickets();
        ExamTicketsManager examTicketsManager = new ExamTicketsManager();
        GeneralProvisions generalProvisions = new GeneralProvisions(callbackQuery);
        RoadMarks roadMarks = new RoadMarks(callbackQuery);
        RoadSigns roadSigns = new RoadSigns(callbackQuery);
        TrafficSignals trafficSignals = new TrafficSignals(callbackQuery);
        Drive drive = new Drive(callbackQuery);
        Speed speed = new Speed(callbackQuery);
        Overtaking overtaking = new Overtaking(callbackQuery);
        Parking parking = new Parking(callbackQuery);
        Crossroad crossroad = new Crossroad(callbackQuery);
        LightsHorn lightsHorn = new LightsHorn(callbackQuery);
        Maintenance maintenance = new Maintenance(callbackQuery);
        SafeDrive safeDrive = new SafeDrive(callbackQuery);
        FirstAid firstAid = new FirstAid(callbackQuery);
        Responsibility responsibility = new Responsibility(callbackQuery);
        DriveOrder driveOrder = new DriveOrder(callbackQuery);
        Bus bus = new Bus(callbackQuery);
        Tow tow = new Tow(callbackQuery);
        SpecialSignals specialSignals = new SpecialSignals(callbackQuery);
        Highway highway = new Highway(callbackQuery);
        TrainingBicycle trainingBicycle = new TrainingBicycle(callbackQuery);
        ResidentialArea residentialArea = new ResidentialArea(callbackQuery);
        Railway railway = new Railway(callbackQuery);
        Crossings crossings = new Crossings(callbackQuery);
        Transportation transportation = new Transportation(callbackQuery);
        DriversResponsibility driversResponsibility = new DriversResponsibility(callbackQuery);
        Emergency emergency = new Emergency(callbackQuery);

        FirstTicket firstTicket = new FirstTicket(callbackQuery);
        SecondTicket secondTicket = new SecondTicket(callbackQuery);
        ThirdTicket thirdTicket = new ThirdTicket(callbackQuery);
        FourthTicket fourthTicket = new FourthTicket(callbackQuery);
        FifthTicket fifthTicket = new FifthTicket(callbackQuery);
        String data = callbackQuery.getData();
        switch (data) {
            case "Exam": {
                execute(deleteMessage(callbackQuery));
                execute(examTicketsManager.ExamManager(callbackQuery));
                break;
            }
            case "Test": {
                execute(deleteMessage(callbackQuery));
                execute(topicTickets.TopicTickets(callbackQuery));
                break;
            }
            case "Tickets": {
                execute(deleteMessage(callbackQuery));
                execute(ticketsManager.TicketsManager(callbackQuery));
                break;
            }
            case "mainMenu": {
                //execute(deleteMessage(callbackQuery));
                execute(new StartBotCommand(callbackQuery.getMessage().getChatId(), callbackQuery.getMessage(),
                        callbackQuery.getMessage().getText(), callbackQuery).getAnswer());
                break;
            }
            case "Ticket1": {
                execute(deleteMessage(callbackQuery));
                execute(firstTicket.question1());
                break;
            }
            case "Ticket2": {
                execute(deleteMessage(callbackQuery));
                execute(secondTicket.question1());
                break;
            }
            case "Ticket3": {
                execute(deleteMessage(callbackQuery));
                execute(thirdTicket.question1());
                break;
            }
            case "Ticket4": {
                execute(deleteMessage(callbackQuery));
                execute(fourthTicket.question1());
                break;
            }
            case "Ticket5": {
                execute(deleteMessage(callbackQuery));
                execute(fifthTicket.question1());
                break;
            }
            case "Общие положения": {
                execute(deleteMessage(callbackQuery));
                execute(generalProvisions.generalProvisionsGetTickets(callbackQuery));
                break;
            }
            case "Дорожные знаки": {
                execute(deleteMessage(callbackQuery));
                execute(roadSigns.roadSigns());
                break;
            }
            case "Дорожная разметка": {
                execute(deleteMessage(callbackQuery));
                execute(roadMarks.roadMarks());
                break;
            }
            case "Сигналы светофора": {
                execute(deleteMessage(callbackQuery));
                execute(trafficSignals.trafficSignals());
                break;
            }
            case "Начало движения": {
                execute(deleteMessage(callbackQuery));
                execute(drive.drive());
                break;
            }
            case "Скорость движения": {
                execute(deleteMessage(callbackQuery));
                execute(speed.speed());
                break;
            }
            case "Обгон, опережение": {
                execute(deleteMessage(callbackQuery));
                execute(overtaking.overtaking());
                break;
            }
            case "Остановка и стоянка": {
                execute(deleteMessage(callbackQuery));
                execute(parking.parking());
                break;
            }
            case "Проезд перекрестков": {
                execute(deleteMessage(callbackQuery));
                execute(crossroad.crossroad());
                break;
            }
            case "Световые/звуковые": {
                execute(deleteMessage(callbackQuery));
                execute(lightsHorn.lightsHorn());
                break;
            }
            case "Неисправности и условия допуска": {
                execute(deleteMessage(callbackQuery));
                execute(maintenance.maintenance());
                break;
            }
            case "Безопасность движения": {
                execute(deleteMessage(callbackQuery));
                execute(safeDrive.safeDrive());
                break;
            }
            case "Оказание мед. помощи": {
                execute(deleteMessage(callbackQuery));
                execute(firstAid.firstAid());
                break;
            }
            case "Общие обязанности": {
                execute(deleteMessage(callbackQuery));
                execute(responsibility.responsibility());
                break;
            }
            case "Расположение ТС": {
                execute(deleteMessage(callbackQuery));
                execute(driveOrder.driveOrder());
                break;
            }
            case "Приоритет маршрутных ТС": {
                execute(deleteMessage(callbackQuery));
                execute(bus.bus());
                break;
            }
            case "Буксировка ТС": {
                execute(deleteMessage(callbackQuery));
                execute(tow.tow());
                break;
            }
            case "Применение сигналов": {
                execute(deleteMessage(callbackQuery));
                execute(specialSignals.specialSignals());
                break;
            }
            case "Движение по автомагистралям": {
                execute(deleteMessage(callbackQuery));
                execute(highway.highway());
                break;
            }
            case "Учебная езда": {
                execute(deleteMessage(callbackQuery));
                execute(trainingBicycle.trainingBicycle());
                break;
            }
            case "Движение в жилых зонах": {
                execute(deleteMessage(callbackQuery));
                execute(residentialArea.residentialArea());
                break;
            }
            case "Движение через Ж/Д пути": {
                execute(deleteMessage(callbackQuery));
                execute(railway.railway());
                break;
            }
            case "Пешеходные переходы": {
                execute(deleteMessage(callbackQuery));
                execute(crossings.crossings());
                break;
            }
            case "Перевозка людей и грузов": {
                execute(deleteMessage(callbackQuery));
                execute(transportation.transportation());
                break;
            }
            case "Ответственность водителя": {
                execute(deleteMessage(callbackQuery));
                execute(driversResponsibility.driversResponsibility());
                break;
            }
            case "Применение аварийной сигнализации": {
                execute(deleteMessage(callbackQuery));
                execute(emergency.emergency());
                break;
            }
        }
    }
    public DeleteMessage deleteMessage(CallbackQuery callbackQuery) throws TelegramApiException {
        DeleteMessage deleteMessage = new DeleteMessage();
        deleteMessage.setChatId(callbackQuery.getMessage().getChatId().toString());
        deleteMessage.setMessageId(callbackQuery.getMessage().getMessageId());
        return deleteMessage;
    }
    public static void main(String[] args) throws TelegramApiException {
        TestBot bot = new TestBot();
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi(DefaultBotSession.class);
        telegramBotsApi.registerBot(bot);
    }
}
