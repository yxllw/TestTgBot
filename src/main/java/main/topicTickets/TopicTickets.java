package main.topicTickets;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class TopicTickets {

    public SendMessage TopicTickets(CallbackQuery callbackQuery) {
        SendMessage message = new SendMessage();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons2 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons3 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons4 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons5 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons6 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons7 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons8 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons9 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons10 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons11 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons12 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons13 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons14 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons15 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons16 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons17 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons18 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons19 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons20 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons21 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons22 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons23 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons24 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons25 = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons26 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("Общие положения").callbackData("Общие положения").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("Дорожные знаки").callbackData("Дорожные знаки").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("Дорожная разметка").callbackData("Дорожная разметка").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Сигналы светофора и регулировщика")
                .callbackData("Сигналы светофора").build();
        InlineKeyboardButton button5 = InlineKeyboardButton.builder().text("Начало движения, маневрирование")
                .callbackData("Начало движения").build();
        InlineKeyboardButton button6 = InlineKeyboardButton.builder().text("Скорость движения").callbackData("Скорость движения").build();
        InlineKeyboardButton button7 = InlineKeyboardButton.builder().text("Обгон, опережение, встречный разъезд").callbackData("Обгон, опережение").build();
        InlineKeyboardButton button8 = InlineKeyboardButton.builder().text("Остановка и стоянка").callbackData("Остановка и стоянка").build();
        InlineKeyboardButton button9 = InlineKeyboardButton.builder().text("Проезд перекрестков").callbackData("Проезд перекрестков").build();
        InlineKeyboardButton button10 = InlineKeyboardButton.builder().text("Пользование световыми/звуковыми сигналами")
                .callbackData("Световые/звуковые").build();
        InlineKeyboardButton button11 = InlineKeyboardButton.builder().text("Неисправности и условия допуска ТС к эксплуатации")
                .callbackData("Неисправности и условия допуска").build();
        InlineKeyboardButton button12 = InlineKeyboardButton.builder().text("Безопасность движения и техника управления ТС")
                .callbackData("Безопасность движения").build();
        InlineKeyboardButton button13 = InlineKeyboardButton.builder().text("Оказание доврачебной мед. помощи").callbackData("Оказание мед. помощи").build();
        InlineKeyboardButton button14 = InlineKeyboardButton
                .builder()
                .text("Общие обязанности водителей")
                .callbackData("Общие обязанности")
                .build();
        InlineKeyboardButton button15 = InlineKeyboardButton
                .builder()
                .text("Расположение ТС на проезжей части")
                .callbackData("Расположение ТС")
                .build();
        InlineKeyboardButton button16 = InlineKeyboardButton
                .builder()
                .text("Приоритет маршрутных ТС")
                .callbackData("Приоритет маршрутных ТС")
                .build();
        InlineKeyboardButton button17 = InlineKeyboardButton
                .builder()
                .text("Буксировка механических ТС")
                .callbackData("Буксировка ТС")
                .build();
        InlineKeyboardButton button18 = InlineKeyboardButton
                .builder()
                .text("Приминение специальных сигналов")
                .callbackData("Применение сигналов")
                .build();
        InlineKeyboardButton button19 = InlineKeyboardButton
                .builder()
                .text("Движение по автомагистралям")
                .callbackData("Движение по автомагистралям")
                .build();
        InlineKeyboardButton button20 = InlineKeyboardButton
                .builder()
                .text("Учебная езда и доп. требования к велосипедистам")
                .callbackData("Учебная езда")
                .build();
        InlineKeyboardButton button21 = InlineKeyboardButton
                .builder()
                .text("Движение в жилых зонах")
                .callbackData("Движение в жилых зонах")
                .build();
        InlineKeyboardButton button22 = InlineKeyboardButton
                .builder()
                .text("Движение через Ж/Д пути")
                .callbackData("Движение через Ж/Д пути")
                .build();
        InlineKeyboardButton button23 = InlineKeyboardButton
                .builder()
                .text("Пешеходные переходы и места остановок МТС")
                .callbackData("Пешеходные переходы")
                .build();
        InlineKeyboardButton button24 = InlineKeyboardButton
                .builder()
                .text("Перевозка людей и грузов")
                .callbackData("Перевозка людей и грузов")
                .build();
        InlineKeyboardButton button25 = InlineKeyboardButton
                .builder()
                .text("Ответственность водителя")
                .callbackData("Ответственность водителя")
                .build();
        InlineKeyboardButton button26 = InlineKeyboardButton
                .builder()
                .text("Применение сигнализации и знака аварийной остановки")
                .callbackData("Применение аварийной сигнализации")
                .build();
        keyboardButtons1.add(button1);
        keyboardButtons2.add(button2);
        keyboardButtons3.add(button3);
        keyboardButtons4.add(button4);
        keyboardButtons5.add(button5);
        keyboardButtons6.add(button6);
        keyboardButtons7.add(button7);
        keyboardButtons8.add(button8);
        keyboardButtons9.add(button9);
        keyboardButtons10.add(button10);
        keyboardButtons11.add(button11);
        keyboardButtons12.add(button12);
        keyboardButtons13.add(button13);
        keyboardButtons14.add(button14);
        keyboardButtons15.add(button15);
        keyboardButtons16.add(button16);
        keyboardButtons17.add(button17);
        keyboardButtons18.add(button18);
        keyboardButtons19.add(button19);
        keyboardButtons20.add(button20);
        keyboardButtons21.add(button21);
        keyboardButtons22.add(button22);
        keyboardButtons23.add(button23);
        keyboardButtons24.add(button24);
        keyboardButtons25.add(button25);
        keyboardButtons26.add(button26);

        List<List<InlineKeyboardButton>> keyButts = new ArrayList<>();
        keyButts.add(keyboardButtons1);
        keyButts.add(keyboardButtons2);
        keyButts.add(keyboardButtons3);
        keyButts.add(keyboardButtons4);
        keyButts.add(keyboardButtons5);
        keyButts.add(keyboardButtons6);
        keyButts.add(keyboardButtons7);
        keyButts.add(keyboardButtons8);
        keyButts.add(keyboardButtons9);
        keyButts.add(keyboardButtons10);
        keyButts.add(keyboardButtons11);
        keyButts.add(keyboardButtons12);
        keyButts.add(keyboardButtons13);
        keyButts.add(keyboardButtons14);
        keyButts.add(keyboardButtons15);
        keyButts.add(keyboardButtons16);
        keyButts.add(keyboardButtons17);
        keyButts.add(keyboardButtons18);
        keyButts.add(keyboardButtons19);
        keyButts.add(keyboardButtons20);
        keyButts.add(keyboardButtons21);
        keyButts.add(keyboardButtons22);
        keyButts.add(keyboardButtons23);
        keyButts.add(keyboardButtons24);
        keyButts.add(keyboardButtons25);
        keyButts.add(keyboardButtons26);


        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setKeyboard(keyButts);
        message.setChatId(callbackQuery.getMessage().getChatId().toString());
        message.setText("Выберите тему для подготовки. ");
        message.setReplyMarkup(markup);
        return message;
    }
}
