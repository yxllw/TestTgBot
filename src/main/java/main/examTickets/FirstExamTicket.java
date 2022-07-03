package main.examTickets;

import main.tickets.caption.FirstTicketCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class FirstExamTicket {
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    FirstTicketCaption firstTicketCaption = new FirstTicketCaption();
    public FirstExamTicket(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto question1() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP1);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftTrue1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question2() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP2);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP3);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("ftAnswer3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP4);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP5);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC5);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question6() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP6);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC6);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question7() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP7);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC7);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question8() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP8);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC8);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question9() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP9);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC9);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question10() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP10);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue10").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftAnswer10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC10);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question11() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP11);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC11);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question12() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP12);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftTrue12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC12);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;

    }
    public SendPhoto question13() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP13);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC13);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question14() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP14);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC14);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question15() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP15);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC15);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question16() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP16);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC16);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question17() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP17);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftTrue17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer17").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftAnswer17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC17);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question18() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP18);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftTrue18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftAnswer18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftAnswer18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC18);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question19() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP19);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftAnswer19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftAnswer19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTrue19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC19);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public SendPhoto question20() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP20);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftLeast20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftLeast20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftResult20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC20);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
}
