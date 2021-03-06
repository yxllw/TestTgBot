package main.topicTickets;

import main.topicTickets.caption.BusCaption;
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

public class Bus {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    BusCaption busCaption = new BusCaption();
    public Bus(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto bus() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp1").build();
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
        sendPhoto.setPhoto(new InputFile(busCaption.FTP1));
        sendPhoto.setCaption(busCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("busFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp1").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupSec1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("busSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp1").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp1").build();
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
        editMessageCaption.setCaption(busCaption.FTC1Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto bus2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp2").build();
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
        sendPhoto.setPhoto(new InputFile(busCaption.FTP2));
        sendPhoto.setCaption(busCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("busFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp2").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupTh2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("busTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp2").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp2").build();
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
        editMessageCaption.setCaption(busCaption.FTC2Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto bus3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp3").build();
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
        sendPhoto.setPhoto(new InputFile(busCaption.FTP3));
        sendPhoto.setCaption(busCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("busFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp3").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupSec3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("busSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp3").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busRight3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp3").build();
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
        editMessageCaption.setCaption(busCaption.FTC3Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto bus4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("busRight4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp4").build();
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
        sendPhoto.setPhoto(new InputFile(busCaption.FTP4));
        sendPhoto.setCaption(busCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("busFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("busRight4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp4").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupSec4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("busSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("busRight4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp4").build();
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
    public EditMessageReplyMarkup EditMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("busTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("busRight4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp4").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("busTh4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("busRight4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp4").build();
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
        editMessageCaption.setCaption(busCaption.FTC4Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto bus5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setPhoto(new InputFile(busCaption.FTP5));
        sendPhoto.setCaption(busCaption.FTC5);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupSec5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("busSec5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("busLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("busSec5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("busHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons1.add(button5);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(busCaption.FTC5Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}
