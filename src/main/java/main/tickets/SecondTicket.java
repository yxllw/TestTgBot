package main.tickets;

import main.tickets.caption.SecondTicketCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class SecondTicket {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    SecondTicketCaption caption = new SecondTicketCaption();

    public SecondTicket(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto question1() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.STC1);
        sendPhoto.setPhoto(new InputFile(caption.STP1));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir1() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh1() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp1() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh1").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        editMessageCaption.setCaption(caption.STC1Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question2(){
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP2);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC2);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC2Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP3);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC3);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC3Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP4);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC4);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC4Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP5);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC5);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("scFo5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC5Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question6() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP6);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh6").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC6);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir6() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh6").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh6() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh6").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp6() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scRight6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh6").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC6Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question7() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP7);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC7);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir7() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec7() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh7() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp7() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC7Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question8() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP8);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight8").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC8);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir8() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight8").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec8() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight8").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp8(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight8").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC8Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question9() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP9);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh9").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC9);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec9() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh9").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh9() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh9").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp9(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh9").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC9Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question10() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP10);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight10").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC10);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir10() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight10").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec10() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight10").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp10(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight10").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC10Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question11() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP11);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh11").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC11);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec11() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh11").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh11() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh11").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp11(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh11").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC11Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question12() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP12);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight12").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC12);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir12() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight12").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec12() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight12").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp12(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight12").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC12Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question13() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP13);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC13);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir13() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec13() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo13() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("scFo13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp13(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC13Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question14() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP14);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC14);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec14() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh14() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo14() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("scFo14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp14(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scRight14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scFo14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC14Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question15() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP15);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight15").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC15);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir15() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight15").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec15() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight15").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp15(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight15").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC15Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question16() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP16);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC16);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp16(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC16Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question17() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP17);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight17").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC17);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight17").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight17").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp17(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight17").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC17Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question18() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP18);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC18);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp18(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scRight18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC18Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question19() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP19);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC19);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir19() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec19() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("scSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp19() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC19Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question20() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP20);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTicketlast20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setCaption(caption.STC20);
        sendPhoto.setPhoto(inputFile);
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir20() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("scFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTicketlast20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh20() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTicketlast20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("scTh20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp20(){
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTicketlast20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTh20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("scHelp20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(caption.STC20Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}
