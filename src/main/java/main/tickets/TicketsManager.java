package main.tickets;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class TicketsManager {

    public SendMessage TicketsManager(CallbackQuery callbackQuery) {
        SendMessage answer = new SendMessage();

        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons5 = new ArrayList<>();

        InlineKeyboardButton button = InlineKeyboardButton.builder().text("Билет #1").callbackData("Ticket1").build();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("Билет #2").callbackData("Ticket2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("Билет #3").callbackData("Ticket3").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("Билет #4").callbackData("Ticket4").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Билет #5").callbackData("Ticket5").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Билет #6").callbackData("Ticket6").build();
        InlineKeyboardButton button6 = InlineKeyboardButton.builder().text("Билет #7").callbackData("Ticket7").build();
        InlineKeyboardButton button7 = InlineKeyboardButton.builder().text("Билет #8").callbackData("Ticket8").build();
        InlineKeyboardButton button8 = InlineKeyboardButton.builder().text("Билет #9").callbackData("Ticket9").build();
        InlineKeyboardButton button9 = InlineKeyboardButton.builder().text("Билет #10").callbackData("Ticket10").build();
        InlineKeyboardButton button10 = InlineKeyboardButton.builder().text("Билет #11").callbackData("Ticket11").build();
        InlineKeyboardButton button11 = InlineKeyboardButton.builder().text("Билет #12").callbackData("Ticket12").build();
        InlineKeyboardButton buttonMainMenu = InlineKeyboardButton.builder().text("В главное меню").callbackData("mainMenu").build();
        keyboardButtons.add(button);
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons1.add(button3);
        keyboardButtons1.add(button4);
        //keyboardButtons1.add(button5);
        //keyboardButtons1.add(button6);
        //keyboardButtons1.add(button7);
        //keyboardButtons2.add(button8);
        //keyboardButtons2.add(button9);
        //keyboardButtons2.add(button10);
        //keyboardButtons2.add(button11);
        //keyboardButtons3.add(buttonMainMenu);
        List<List<InlineKeyboardButton>> keyButts = new ArrayList<>();
        keyButts.add(keyboardButtons);
        keyButts.add(keyboardButtons1);
        keyButts.add(keyboardButtons2);
        keyButts.add(keyboardButtons3);
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(keyButts);

        answer.setText("Выберите билет:");
        answer.setChatId(callbackQuery.getMessage().getChatId().toString());
        answer.setReplyMarkup(keyboard);

        return answer;
    }
}
