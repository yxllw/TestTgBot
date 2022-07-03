package main;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class StartBotCommand {
    private final String START_TEXT = "Выбери экзамен если уже готов, или тренировку, если хочешь попрактиковаться. Можно повторить отдельные, интересующие тебя темы.  \uD83D\uDE97";
    private final String NO_COMMAND = "Такой команды не существует. Выбери команду из списка меню.";
    Long chatID;
    Message message;
    String data;
    CallbackQuery callbackQuery;
    public StartBotCommand(Long chatID, Message message, String data, CallbackQuery callbackQuery) {
        this.chatID = chatID;
        this.message = message;
        this.data = data;
        this.callbackQuery = callbackQuery;
    }
    public SendMessage getAnswer() {
        SendMessage answer = new SendMessage();
        if(data.equals("/start")) {
            List<InlineKeyboardButton> keyboardButtonList1 = new ArrayList<>();
            List<InlineKeyboardButton> keyboardButtonList2 = new ArrayList<>();

            InlineKeyboardButton buttonExam = new InlineKeyboardButton();
            buttonExam.setText("Экзамен");
            buttonExam.setCallbackData("Exam");

            InlineKeyboardButton buttonTraining = new InlineKeyboardButton();
            buttonTraining.setText("Подготовка по темам");
            buttonTraining.setCallbackData("Test");
            keyboardButtonList1.add(buttonExam);
            keyboardButtonList1.add(buttonTraining);

            InlineKeyboardButton buttonTickets = new InlineKeyboardButton();
            buttonTickets.setText("Билеты");
            buttonTickets.setCallbackData("Tickets");
            keyboardButtonList2.add(buttonTickets);

            List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
            buttons.add(keyboardButtonList1);
            buttons.add(keyboardButtonList2);

            InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
            keyboard.setKeyboard(buttons);
            answer.setText(START_TEXT);
            answer.setChatId(chatID.toString());
            answer.setReplyMarkup(keyboard);
        }
        else {
            answer.setText(NO_COMMAND);
            answer.setChatId(chatID.toString());
        }
        return answer;
    }
}
