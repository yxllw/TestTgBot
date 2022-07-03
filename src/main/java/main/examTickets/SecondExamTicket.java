package main.examTickets;

import main.tickets.caption.SecondTicketCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class SecondExamTicket {
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    SecondTicketCaption caption = new SecondTicketCaption();
    public SecondExamTicket(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
        this.chat_id = callbackQuery.getMessage().getChatId();
        this.message_id = callbackQuery.getMessage().getMessageId();
    }
    public SendPhoto question1() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer1").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTrue1").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer1").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question2(){
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP2);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scTrue2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP3);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scTrue3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP4);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer4").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scTrue4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP5);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTrue5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scAnswer5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question6() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP6);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scTrue6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question7() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP7);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer7").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scTrue7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question8() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP8);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question9() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP9);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scTrue9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question10() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP10);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question11() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP11);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scTrue11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question12() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP12);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question13() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP13);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue13").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scAnswer13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question14() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP14);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scTrue14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer14").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scAnswer14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question15() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP15);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question16() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP16);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer16").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scTrue16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question17() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP17);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question18() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP18);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scAnswer18").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("4").callbackData("scTrue18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button5);
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
    public SendPhoto question19() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP19);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scAnswer19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scAnswer19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scTrue19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
    public SendPhoto question20() {
        SendPhoto sendPhoto = new SendPhoto();
        InputFile inputFile = new InputFile(caption.STP20);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("scLeast20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("scResult20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("scLeast20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
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
}
