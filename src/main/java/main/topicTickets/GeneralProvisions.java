package main.topicTickets;

import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.InputFile;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class GeneralProvisions {
    private final String FIRST_WRONG = "1 ❌";
    private final String SECOND_WRONG = "2 ❌";
    private final String THIRD_WRONG = "3 ❌";
    private final String FOURTH_WRONG = "4 ❌";

    CallbackQuery callbackQuery;
    public GeneralProvisions(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }

    public SendPhoto generalProvisionsGetTickets(CallbackQuery callbackQuery) {
        TicketsPhotos ticketsPhotos = new TicketsPhotos();
        SendPhoto question = new SendPhoto();
        InputFile inputFile = new InputFile(ticketsPhotos.GPFIRST);
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("1");
        button1.setCallbackData("gpFir1");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("2");
        button2.setCallbackData("gpSec1");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("gpRight1");
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Подсказка");
        button4.setCallbackData("gpHelp1");
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setPhoto(inputFile);
        question.setCaption("Соответствуют ли действия водителя Правилам, если он движется посередине дороги?\n" +
                "1. " +
                "Соответствуют\n" +
                "2. " +
                "Соответствуют, если отсутствуют встречные транспортные средства\n" +
                "3. " +
                "Не соответствуют");
        question.setReplyMarkup(keyboard);
        return question;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText(FIRST_WRONG);
        button1.setCallbackData("gpFir1");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("2");
        button2.setCallbackData("gpSec1");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("gpRight1");
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Подсказка");
        button4.setCallbackData("gpHelp1");

        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);
        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        EditMessageReplyMarkup editMessageMarkup = new EditMessageReplyMarkup();
        editMessageMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageMarkup.setReplyMarkup(keyboard);

        return editMessageMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("1");
        button1.setCallbackData("gpFir1");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText(SECOND_WRONG);
        button2.setCallbackData("gpSec1");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("gpRight1");
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Подсказка");
        button4.setCallbackData("gpHelp1");

        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        EditMessageReplyMarkup editMessageMarkup = new EditMessageReplyMarkup();
        editMessageMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageMarkup.setReplyMarkup(keyboard);

        return editMessageMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp1() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = new InlineKeyboardButton();
        button1.setText("1");
        button1.setCallbackData("gpFir1");
        InlineKeyboardButton button2 = new InlineKeyboardButton();
        button2.setText("2");
        button2.setCallbackData("gpSec1");
        InlineKeyboardButton button3 = new InlineKeyboardButton();
        button3.setText("3");
        button3.setCallbackData("gpRight1");
        InlineKeyboardButton button4 = new InlineKeyboardButton();
        button4.setText("Подсказка");
        button4.setCallbackData("gpHelp1");
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
        editMessageCaption.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageCaption.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageCaption.setReplyMarkup(keyboard);
        editMessageCaption.setCaption("Соответствуют ли действия водителя Правилам, если он движется посередине дороги?\n" +
                "1. " +
                "Соответствуют\n" +
                "2. " +
                "Соответствуют, если отсутствуют встречные транспортные средства\n" +
                "3. " +
                "Не соответствуют\n\n" +
                "Правильный ответ: 3\n" +
                "Водитель должен занимать сторону дороги, предназначенную для движения в данном направлении. " +
                "Так как у нас правостороннее движение, он должен занять правую сторону дороги. Движение посередине дороги является нарушением. (Пункты 1.4, 9.1 ПДД)");
        return editMessageCaption;
    }

    public SendPhoto question2() {
        SendPhoto question = new SendPhoto();
        InputFile file = new InputFile("https://imgur.com/o6PYwWW");
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();
        InlineKeyboardButton button1 = InlineKeyboardButton.builder().text("1").callbackData("gpFir2").build();
        InlineKeyboardButton button2 = InlineKeyboardButton.builder().text("2").callbackData("gpRight2").build();
        InlineKeyboardButton button3 = InlineKeyboardButton.builder().text("3").callbackData("gpTh2").build();
        InlineKeyboardButton button4 = InlineKeyboardButton.builder().text("Подсказка").callbackData("gpHelp2").build();
        keyboardButtons.add(button1);
        keyboardButtons.add(button2);
        keyboardButtons.add(button3);
        keyboardButtons1.add(button4);

        List<List<InlineKeyboardButton>> buttons = new ArrayList<>();
        buttons.add(keyboardButtons);
        buttons.add(keyboardButtons1);

        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.setKeyboard(buttons);

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setPhoto(file);
        question.setCaption("Сколько полос для движения имеет данная дорога? \n" +
                "1. Две \n" +
                "2. Четыре \n" +
                "3. Пять");
        question.setReplyMarkup(keyboard);
        return question;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("gpFir2")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight2")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh2")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp2")
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh2() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpFir2")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight2")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("gpTh2")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp2")
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp2() {
        EditMessageCaption question = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpFir2")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight2")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh2")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp2")
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

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setMessageId(callbackQuery.getMessage().getMessageId());
        question.setCaption("Сколько полос для движения имеет данная дорога? \n" +
                "1. Две \n" +
                "2. Четыре \n" +
                "3. Пять \n\n" +
                "Правильный ответ: 2\n" +
                "Разделительная полоса делит дорогу на проезжие части. Данная дорога имеет две проезжие части, четыре полосы движения. (Пункт 1.2 ПДД)");
        question.setReplyMarkup(keyboard);
        return question;
    }

    public SendPhoto question3() {
        SendPhoto question = new SendPhoto();
        InputFile file = new InputFile("https://imgur.com/SLrtqj8");
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpRight3")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec3")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh3")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp3")
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

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setPhoto(file);
        question.setCaption("Выезжая с грунтовой дороги на перекресток, Вы попадаете: \n" +
                "1. На главную дорогу \n" +
                "2. На равнозначную дорогу, поскольку отсутствуют знаки приоритета \n" +
                "3. На равнозначную дорогу, поскольку проезжая часть имеет твердое покрытие перед перекрестком");
        question.setReplyMarkup(keyboard);
        return question;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpRight3")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("gpSec3")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh3")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp3")
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
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpRight3")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec3")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("gpTh3")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp3")
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
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp3() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpRight3")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec3")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh3")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp3")
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
        editMessageCaption.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageCaption.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageCaption.setCaption("Выезжая с грунтовой дороги на перекресток, Вы попадаете: \n" +
                "1. На главную дорогу \n" +
                "2. На равнозначную дорогу, поскольку отсутствуют знаки приоритета \n" +
                "3. На равнозначную дорогу, поскольку проезжая часть имеет твердое покрытие перед перекрестком \n\n" +
                "Правильный ответ: 1\n" +
                "Главной является дорога с покрытием по отношению к грунтовой. Перекрёсток неравнозначный. " +
                "Вы находитесь на второстепенной дороге, выезжать будете на главную. (Пункт 1.2 термин «Главная дорога»)");
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;
    }

    public SendPhoto question4() {
        SendPhoto question = new SendPhoto();
        InputFile file = new InputFile("https://imgur.com/9deVJHZ");
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp4")
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

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setPhoto(file);
        question.setReplyMarkup(keyboard);
        question.setCaption("Сколько полос для движения имеет проезжая часть данной дороги? \n" +
                "1. Одну полосу  \n" +
                "2. Две полосы \n" +
                "3. Три полосы \n");
        return question;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupFir4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text(FIRST_WRONG)
                .callbackData("gpFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp4")
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh4() {
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("gpTh4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp4")
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
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp4() {
        EditMessageCaption question = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpFir4")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpRight4")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh4")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp4")
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

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setMessageId(callbackQuery.getMessage().getMessageId());
        question.setReplyMarkup(keyboard);
        question.setCaption("Сколько полос для движения имеет проезжая часть данной дороги? \n" +
                "1. Одну полосу  \n" +
                "2. Две полосы \n" +
                "3. Три полосы \n\n" +
                "Правильный ответ: 2\n" +
                "Сплошная линия горизонтальной разметки 1.1 применяется часто. Она может быть использована и для распределения транспортных потоков, и для обозначения границ полос. " +
                "В данном случае она разделяет транспортные потоки одной неширокой проезжей части, на которой, судя по автомобилю, по одной полосе движения в каждом направлении, т.е. две. " +
                "Мотоциклисты двигаются по одной полосе в два ряда, что им не запрещено. («Горизонтальная разметка», пункты 1.2, 9.1 ПДД)");
        return question;
    }

    public SendPhoto question5() {
        SendPhoto question = new SendPhoto();
        InputFile file = new InputFile("https://imgur.com/xJTk2Lh");
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpLast5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp5")
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

        question.setChatId(callbackQuery.getMessage().getChatId().toString());
        question.setPhoto(file);
        question.setReplyMarkup(keyboard);
        question.setCaption("Сколько проезжих частей имеет данная дорога? \n" +
                "1. Одну  \n" +
                "2. Две \n" +
                "3. Четыре \n");
        return question;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupSec5() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpLast5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text(SECOND_WRONG)
                .callbackData("gpSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp5")
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
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageReplyMarkup editMessageReplyMarkupTh5() {
        EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpLast5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text(THIRD_WRONG)
                .callbackData("gpTh5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp5")
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
        editMessageReplyMarkup.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageReplyMarkup.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageReplyMarkup.setReplyMarkup(keyboard);
        return editMessageReplyMarkup;
    }
    public EditMessageCaption editMessageCaptionHelp5() {
        EditMessageCaption editMessageCaption = new EditMessageCaption();
        List<InlineKeyboardButton> keyboardButtons = new ArrayList<>();
        List<InlineKeyboardButton> keyboardButtons1 = new ArrayList<>();

        InlineKeyboardButton button1 = InlineKeyboardButton
                .builder()
                .text("1")
                .callbackData("gpLast5")
                .build();
        InlineKeyboardButton button2 = InlineKeyboardButton
                .builder()
                .text("2")
                .callbackData("gpSec5")
                .build();
        InlineKeyboardButton button3 = InlineKeyboardButton
                .builder()
                .text("3")
                .callbackData("gpTh5")
                .build();
        InlineKeyboardButton button4 = InlineKeyboardButton
                .builder()
                .text("Подсказка")
                .callbackData("gpHelp5")
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
        editMessageCaption.setChatId(callbackQuery.getMessage().getChatId().toString());
        editMessageCaption.setCaption("Сколько проезжих частей имеет данная дорога? \n" +
                "1. Одну  \n" +
                "2. Две \n" +
                "3. Четыре \n\n" +
                "Правильный ответ: 1\n" +
                "Данная горизонтальная разметка 1.3 не делит дорогу на проезжие части. Поэтому в изображенной ситуации дорога имеет четыре полосы движения и одну проезжую часть. " +
                "(Пункт 1.2 ПДД термин «Разделительная полоса»)");
        editMessageCaption.setMessageId(callbackQuery.getMessage().getMessageId());
        editMessageCaption.setReplyMarkup(keyboard);
        return editMessageCaption;

    }

}
