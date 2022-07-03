package main.topicTickets;

import main.topicTickets.caption.ResponsibilityCaption;
import main.topicTickets.caption.TowCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class Tow {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    TowCaption towCaption = new TowCaption();
    public Tow(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto tow() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp1").build();
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
        sendPhoto.setPhoto(new InputFile(towCaption.FTP1));
        sendPhoto.setCaption(towCaption.FTC1);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("towFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp1").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("towSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp1").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towRight1").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp1").build();
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
        editMessageCaption.setCaption(towCaption.FTC1Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto tow2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp2").build();
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
        sendPhoto.setPhoto(new InputFile(towCaption.FTP1));
        sendPhoto.setCaption(towCaption.FTC2);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("towFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp2").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("towTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp2").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh2").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp2").build();
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
        editMessageCaption.setCaption(towCaption.FTC2Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto tow3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp3").build();
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
        sendPhoto.setPhoto(new InputFile(towCaption.FTP1));
        sendPhoto.setCaption(towCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("towFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp3").build();
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

    public EditMessageReplyMarkup EditMessageReplyMarkupTh3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("towTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp3").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp3").build();
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
        editMessageCaption.setCaption(towCaption.FTC3Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto tow4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp4").build();
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
        sendPhoto.setPhoto(new InputFile(towCaption.FTP1));
        sendPhoto.setCaption(towCaption.FTC4);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupFir4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("towFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp4").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("towTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp4").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towRight4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp4").build();
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
        editMessageCaption.setCaption(towCaption.FTC4Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
    public SendPhoto tow5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp5").build();
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
        sendPhoto.setPhoto(new InputFile(towCaption.FTP1));
        sendPhoto.setCaption(towCaption.FTC5);
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public EditMessageReplyMarkup EditMessageReplyMarkupSec5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("towSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp5").build();
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

    public EditMessageReplyMarkup EditMessageReplyMarkupTh5() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("towTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp5").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("towLast5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("towSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("towTh5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("towHelp5").build();
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
        editMessageCaption.setCaption(towCaption.FTC5Help);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

}
