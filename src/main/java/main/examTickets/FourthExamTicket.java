package main.examTickets;

import main.tickets.caption.FourthTicketCaption;
import main.tickets.caption.ThirdTicketCaption;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class FourthExamTicket {
    CallbackQuery callbackQuery;
    Long chat_id;
    Integer message_id;
    FourthTicketCaption caption = new FourthTicketCaption();
    public FourthExamTicket(CallbackQuery callbackQuery) {
            this.callbackQuery = callbackQuery;
            this.chat_id = callbackQuery.getMessage().getChatId();
            this.message_id = callbackQuery.getMessage().getMessageId();
        }
        public SendPhoto question1() {
            SendPhoto sendPhoto = new SendPhoto();
            List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
            List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
            InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer1").build();
            InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer").build();
            InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue1").build();
            keyboardButtons.add(button1);
            keyboardButtons.add(button2);
            keyboardButtons.add(button3);
            List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
            buttons.add(keyboardButtons);
            buttons.add(keyboardButtons1);
            InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
            keyboard.setKeyboard(buttons);

            sendPhoto.setCaption(caption.FTC1);
            sendPhoto.setPhoto(new InputFile(caption.FTP1));
            sendPhoto.setChatId(chat_id.toString());
            sendPhoto.setReplyMarkup(keyboard);
            return sendPhoto;
    }

    public SendPhoto question2() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foTrue2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC2);
        sendPhoto.setPhoto(new InputFile(caption.FTP2));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question3() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer3").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue3").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("foAnswer3").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC3);
        sendPhoto.setPhoto(new InputFile(caption.FTP3));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question4() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer4").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer4").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue4").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC4);
        sendPhoto.setPhoto(new InputFile(caption.FTP4));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question5() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer5").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foTrue5").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer5").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC5);
        sendPhoto.setPhoto(new InputFile(caption.FTP5));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question6() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foTrue6").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer6").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer6").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC6);
        sendPhoto.setPhoto(new InputFile(caption.FTP6));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question7() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foTrue7").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer7").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer7").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC7);
        sendPhoto.setPhoto(new InputFile(caption.FTP7));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question8() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer8").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foTrue8").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer8").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC8);
        sendPhoto.setPhoto(new InputFile(caption.FTP8));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question9() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer9").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer9").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue9").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC9);
        sendPhoto.setPhoto(new InputFile(caption.FTP9));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question10() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer10").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer10").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue10").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC10);
        sendPhoto.setPhoto(new InputFile(caption.FTP10));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question11() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foTrue11").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer11").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer11").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC11);
        sendPhoto.setPhoto(new InputFile(caption.FTP11));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question12() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer12").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer12").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue12").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC12);
        sendPhoto.setPhoto(new InputFile(caption.FTP12));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question13() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer13").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer13").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue13").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC13);
        sendPhoto.setPhoto(new InputFile(caption.FTP13));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question14() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer14").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foTrue14").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer14").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC14);
        sendPhoto.setPhoto(new InputFile(caption.FTP14));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question15() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer15").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foTrue15").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer15").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC15);
        sendPhoto.setPhoto(new InputFile(caption.FTP15));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question16() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer16").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer16").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue16").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC16);
        sendPhoto.setPhoto(new InputFile(caption.FTP16));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question17() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer17").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer17").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foTrue17").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC17);
        sendPhoto.setPhoto(new InputFile(caption.FTP17));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question18() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foAnswer18").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer18").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer18").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("foTrue18").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC18);
        sendPhoto.setPhoto(new InputFile(caption.FTP18));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question19() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foTrue19").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foAnswer19").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foAnswer19").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("4").callbackData("foAnswer19").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC19);
        sendPhoto.setPhoto(new InputFile(caption.FTP19));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
    public SendPhoto question20() {
        SendPhoto sendPhoto = new SendPhoto();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("foLeast20").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("foResult20").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("foLeast20").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        sendPhoto.setCaption(caption.FTC20);
        sendPhoto.setPhoto(new InputFile(caption.FTP20));
        sendPhoto.setChatId(chat_id.toString());
        sendPhoto.setReplyMarkup(keyboard);
        return sendPhoto;
    }
}
