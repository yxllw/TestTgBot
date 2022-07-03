package main.examTickets;

import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

import java.util.Random;

public class ExamTicketsManager {

    public SendPhoto ExamManager(CallbackQuery callbackQuery) {
        FirstExamTicket firstExamTicket = new FirstExamTicket(callbackQuery);
        SecondExamTicket secondExamTicket = new SecondExamTicket(callbackQuery);
        ThirdExamTicket thirdExamTicket = new ThirdExamTicket(callbackQuery);
        FourthExamTicket fourthExamTicket = new FourthExamTicket(callbackQuery);
        FifthExamTicket fifthExamTicket = new FifthExamTicket(callbackQuery);
        SendPhoto answer;

        Random random = new Random();
        int data = random.nextInt(5);

        switch (data) {
            case 0: {
                answer = firstExamTicket.question1();
                return answer;
            }
            case 1: {
                answer = secondExamTicket.question1();
                return answer;
            }
            case 2: {
                answer = thirdExamTicket.question1();
                return answer;
            }
            case 3: {
                answer = fourthExamTicket.question1();
                return answer;
            }
            case 4: {
                answer = fifthExamTicket.question1();
                return answer;
            }
        }
        return null;
    }


}
