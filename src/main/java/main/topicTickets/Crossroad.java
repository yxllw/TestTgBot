package main.topicTickets;

import main.topicTickets.caption.CrossroadCaption;
import org.checkerframework.checker.units.qual.C;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Crossroad {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    CrossroadCaption crossroadCaption = new CrossroadCaption();
    public Crossroad(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto crossroad() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(crossroadCaption.FTP1));
        sendPhoto.setCaption(crossroadCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("cdFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("cdSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("cdFo1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(crossroadCaption.FTC1Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto crossroad2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(crossroadCaption.FTP2));
        sendPhoto.setCaption(crossroadCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("cdFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("cdSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(crossroadCaption.FTC2Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto crossroad3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(crossroadCaption.FTP3));
        sendPhoto.setCaption(crossroadCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("cdFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("cdTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(crossroadCaption.FTC3Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto crossroad4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(crossroadCaption.FTP4));
        sendPhoto.setCaption(crossroadCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("cdSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("cdTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("cdFo4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("cdFo4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(crossroadCaption.FTC4Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto crossroad5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdLast5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(crossroadCaption.FTP5));
        sendPhoto.setCaption(crossroadCaption.FTC5);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("cdFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdLast5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdLast5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("cdTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("cdFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("cdLast5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("cdTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("cdHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(crossroadCaption.FTC5Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}
