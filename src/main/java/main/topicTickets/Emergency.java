package main.topicTickets;

import main.topicTickets.caption.EmergencyCaption;
import main.topicTickets.caption.ResponsibilityCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Emergency {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    EmergencyCaption emergencyCaption = new EmergencyCaption();
    public Emergency(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto emergency() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp1").build();
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
        sendPhoto.setPhoto(new InputFile(emergencyCaption.FTP1));
        sendPhoto.setCaption(emergencyCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupSec1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("eySec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp1").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupTh1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("eyTh1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp1").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp1").build();
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
        editMessageCaption.setCaption(emergencyCaption.FTC1Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto emergency2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp2").build();
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
        sendPhoto.setPhoto(new InputFile(emergencyCaption.FTP2));
        sendPhoto.setCaption(emergencyCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("eyFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp2").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupSec2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("eySec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp2").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyRight2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp2").build();
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
        editMessageCaption.setCaption(emergencyCaption.FTC2Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto emergency3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eyRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("eyFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp3").build();
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
        sendPhoto.setPhoto(new InputFile(emergencyCaption.FTP3));
        sendPhoto.setCaption(emergencyCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("eyFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eyRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("eyFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp3").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupTh3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eyRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("eyTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("eyFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp3").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupFo3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eyRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("eyFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp3").build();
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
    public EditMessageCaption editMessageCaptionHelp3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eyRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("eyFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp3").build();
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
        editMessageCaption.setCaption(emergencyCaption.FTC3Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto emergency4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp4").build();
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
        sendPhoto.setPhoto(new InputFile(emergencyCaption.FTP4));
        sendPhoto.setCaption(emergencyCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupSec4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("eySec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp4").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("eyTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp4").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyRight4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp4").build();
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
        editMessageCaption.setCaption(emergencyCaption.FTC4Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto emergency5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyLast5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp5").build();
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
        sendPhoto.setPhoto(new InputFile(emergencyCaption.FTP2));
        sendPhoto.setCaption(emergencyCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("eyFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyLast5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp5").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupSec5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("eySec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyLast5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp5").build();
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
    public EditMessageCaption editMessageCaptionHelp5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("eyFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("eySec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("eyLast5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("eyHelp5").build();
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
        editMessageCaption.setCaption(emergencyCaption.FTC5Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}
