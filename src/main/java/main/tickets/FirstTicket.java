package main.tickets;

import main.tickets.caption.FirstTicketCaption;
import main.topicTickets.TicketsPhotos;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class FirstTicket {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    FirstTicketCaption firstTicketCaption = new FirstTicketCaption();
    public FirstTicket(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto question1() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP1);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir1")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight1")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh1")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp1")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

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
    public EditMessageReplyMarkup editMessageReplyMarkupFir1() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir1")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight1")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh1")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp1")
                .build();
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

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir1")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight1")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh1")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp1")
                .build();
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

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir1")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight1")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh1")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp1")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC1Help);
        return editMessageCaption;
    }

    public SendPhoto question2() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP2);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec2() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("ftSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp2").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupTh2() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("ftTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp2").build();
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
    public EditMessageCaption editMessageCaptionHelp2() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(firstTicketCaption.FTC2Help);
        return editMessageCaption;
    }

    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP3);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("ftFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp3").build();
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

        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC3);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec3() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("ftSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("ftFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp3").build();
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;

    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh3() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text(THIRD_WRONG).callbackData("ftTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("ftFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp3").build();
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo3() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text(FOURTH_WRONG).callbackData("ftFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp3").build();
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp3() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("ftFo3").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp3").build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC3Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP4);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir4() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("ftFir4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;

    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec4() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp4")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;

    }
    public EditMessageCaption editMessageCaptionHelp4() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp4")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setCaption(firstTicketCaption.FTC4Help);
        editMessageCaption.setChatId(chat_id.toString());
        return editMessageCaption;
    }

    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP5);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight5").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir5() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp5")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec5() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp5")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp5() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp5")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setCaption(firstTicketCaption.FTC5Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question6() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP6);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh6").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec6() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec6")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh6")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp6")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh6() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight6")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec6")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh6")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp6")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp6() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight6")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec6")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh6")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp6")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC6Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        return editMessageCaption;
    }

    public SendPhoto question7() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP7);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight7").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir7() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir7")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec7")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight7")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp7")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec7() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir7")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec7")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight7")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp7")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp7() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir7")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec7")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight7")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp7")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC7Help);
        return editMessageCaption;
    }

    public SendPhoto question8() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP8);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight8").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir8() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir8")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec8")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight8")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp8")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec8() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir8")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec8")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight8")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp8")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp8() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir8")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec8")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight8")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp8")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setCaption(firstTicketCaption.FTC8Help);
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question9() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP9);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh9").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec9() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight9")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec9")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh9")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp9")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh9() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight9")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec9")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh9")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp9")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp9() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight9")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec9")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh9")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp9")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC9Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        return editMessageCaption;
    }

    public SendPhoto question10() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP10);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight10").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp10").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftFo10").build();
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
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC10);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir10() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir10")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec10")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight10")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp10")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo10")
                .build();
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
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec10() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir10")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec10")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight10")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp10")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo10")
                .build();
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
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFo10(){
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir10")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec10")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight10")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp10")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text(FOURTH_WRONG)
                .callbackData("ftFo10")
                .build();
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
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp10() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir10")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec10")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight10")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp10")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo10")
                .build();
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
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC10Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        return editMessageCaption;
    }

    public SendPhoto question11() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP11);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight11").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir11() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir11")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec11")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight11")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp11")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec11() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir11")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec11")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight11")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp11")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp11() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir11")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec11")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight11")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp11")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setCaption(firstTicketCaption.FTC11Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question12() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP12);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftRight12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh12").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir12() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir12")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight12")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh12")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp12")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh12() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir12")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight12")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh12")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp12")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp12() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir12")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight12")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh12")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp12")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption(firstTicketCaption.FTC12Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        return editMessageCaption;
    }

    public SendPhoto question13() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP13);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight13").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir13() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir13")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec13")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight13")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp13")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec13() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir13")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec13")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight13")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp13")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp13() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir13")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec13")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight13")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp13")
                .build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC13Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question14() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP14);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight14").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir14() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir14")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec14")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight14")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp14")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec14() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir14")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec14")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight14")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp14")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        editMessageReplyMarkup.setChatId(chat_id.toString());
        editMessageReplyMarkup.setMessageId(message_id);
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp14() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir14")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec14")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight14")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp14")
                .build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC14Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question15() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP15);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec15").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec15() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight15")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec15")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp15")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
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
    public EditMessageCaption editMessageCaptionHelp15() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight15")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec15")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp15")
                .build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        editMessageCaption.setCaption(firstTicketCaption.FTC15Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question16() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP16);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight16").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir16")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec16")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight16")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp16")
                .build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir16")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec16")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight16")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp16")
                .build();
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
    public EditMessageCaption editMessageCaptionHelp16() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir16")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec16")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftRight16")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp16")
                .build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC16Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question17() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP17);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftRight17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh17").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp17").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftFo17").build();
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
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC17);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("ftFir17")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight17")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh17")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp17")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo17")
                .build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupTh17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir17")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight17")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh17")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp17")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo17")
                .build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupFo17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir17")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight17")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh17")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp17")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text(FOURTH_WRONG)
                .callbackData("ftFo17")
                .build();
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
    public EditMessageCaption editMessageCaptionHelp17() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftFir17")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftRight17")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh17")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp17")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo17")
                .build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC17Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question18() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP18);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftRight18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTh18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("ftFo18").build();
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
        sendPhoto.setPhoto(inputFile);
        sendPhoto.setCaption(firstTicketCaption.FTC18);
        sendPhoto.setReplyMarkup(keyboard);
        sendPhoto.setChatId(chat_id.toString());
        return sendPhoto;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight18")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("ftSec18")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh18")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp18")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo18")
                .build();
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

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight18")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec18")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("ftTh18")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp18")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo18")
                .build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupFo18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight18")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec18")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh18")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp18")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text(FOURTH_WRONG)
                .callbackData("ftFo18")
                .build();
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
    public EditMessageCaption editMessageCaptionHelp18() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("ftRight18")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("ftSec18")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("ftTh18")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("ftHelp18")
                .build();
        InlineKeyboardButton button5 = InlineKeyboardButton
                .builder()
                .text("4")
                .callbackData("ftFo18")
                .build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC18Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question19() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP19);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir19() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("ftFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp19").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("ftSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp19").build();
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
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftRight19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp19").build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC19Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question20() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(firstTicketCaption.FTP20);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTicketlast20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
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
    public EditMessageReplyMarkup editMessageReplyMarkupFir20() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text(FIRST_WRONG).callbackData("ftFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTicketlast20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp20").build();
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
    public EditMessageReplyMarkup editMessageReplyMarkupSec20() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text(SECOND_WRONG).callbackData("ftSec20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTicketlast20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp20").build();
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
    public EditMessageCaption editMessageCaptionHelp20() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("ftFir20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("ftSec20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("ftTicketlast20").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("ftHelp20").build();
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
        editMessageCaption.setCaption(firstTicketCaption.FTC20Help);
        editMessageCaption.setChatId(chat_id.toString());
        editMessageCaption.setMessageId(message_id);
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }
}
