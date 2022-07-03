package main.topicTickets;

import main.topicTickets.caption.SpeedCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Speed {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    SpeedCaption speedCaption = new SpeedCaption();

    public Speed(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto speed() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp1").build();
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
        sendPhoto.setPhoto(new InputFile(speedCaption.FTP1));
        sendPhoto.setCaption(speedCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("spFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp1").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("spSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp1").build();
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
    public EditMessageCaption editMessageCaptionHelp1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp1").build();
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
        editMessageCaption.setCaption(speedCaption.FTC1Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto question2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp2").build();
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
        sendPhoto.setPhoto(new InputFile(speedCaption.FTP2));
        sendPhoto.setCaption(speedCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("spFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp2").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("spSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp2").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupFo2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("spFo2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp2").build();
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
    public EditMessageCaption editMessageCaptionHelp2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp2").build();
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
        editMessageCaption.setCaption(speedCaption.FTC2Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp3").build();
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
        sendPhoto.setPhoto(new InputFile(speedCaption.FTP3));
        sendPhoto.setCaption(speedCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("spFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp3").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("spSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp3").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp3").build();
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
        editMessageCaption.setCaption(speedCaption.FTC3Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp4").build();
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
        sendPhoto.setPhoto(new InputFile(speedCaption.FTP4));
        sendPhoto.setCaption(speedCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("spFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp4").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("spTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp4").build();
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
    public EditMessageCaption editMessageCaptionHelp4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp4").build();
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
        editMessageCaption.setCaption(speedCaption.FTC4Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spLast5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button5);
        keyboardButtons.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(speedCaption.FTP5));
        sendPhoto.setCaption(speedCaption.FTC5);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("spFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spLast5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp5").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("spSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spLast5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp5").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupFo5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spLast5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("spFo5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp5").build();
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
    public EditMessageCaption editMessageCaptionHelp5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("spFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("spSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("spLast5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("spFo5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("spHelp5").build();
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
        editMessageCaption.setCaption(speedCaption.FTC5Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}