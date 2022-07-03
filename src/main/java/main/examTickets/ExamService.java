package main.examTickets;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public class ExamService {
    CallbackQuery callbackQuery;
    SendPhoto question = new SendPhoto();
    public ExamService(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }
    public SendPhoto getQuestion() {
        FirstExamTicket firstExamTicket = new FirstExamTicket(callbackQuery);
        SecondExamTicket secondExamTicket = new SecondExamTicket(callbackQuery);
        ThirdExamTicket thirdExamTicket = new ThirdExamTicket(callbackQuery);
        FourthExamTicket fourthExamTicket = new FourthExamTicket(callbackQuery);
        FifthExamTicket fifthExamTicket = new FifthExamTicket(callbackQuery);
        String data = callbackQuery.getData();
        switch (data) {
            case "ftAnswer1":
            case "ftTrue1": {
                question = firstExamTicket.question2();
                break;
            }
            case "ftAnswer2":
            case "ftTrue2": {
                question = firstExamTicket.question3();
                break;
            }
            case "ftAnswer3":
            case "ftTrue3": {
                question = firstExamTicket.question4();
                break;
            }
            case "ftAnswer4":
            case "ftTrue4": {
                question = firstExamTicket.question5();
                break;
            }
            case "ftAnswer5":
            case "ftTrue5": {
                question = firstExamTicket.question6();
                break;
            }
            case "ftAnswer6":
            case "ftTrue6": {
                question = firstExamTicket.question7();
                break;
            }
            case "ftAnswer7":
            case "ftTrue7": {
                question = firstExamTicket.question8();
                break;
            }
            case "ftAnswer8":
            case "ftTrue8": {
                question = firstExamTicket.question9();
                break;
            }
            case "ftAnswer9":
            case "ftTrue9": {
                question = firstExamTicket.question10();
                break;
            }
            case "ftAnswer10":
            case "ftTrue10": {
                question = firstExamTicket.question11();
                break;
            }
            case "ftAnswer11":
            case "ftTrue11": {
                question = firstExamTicket.question12();
                break;
            }
            case "ftAnswer12":
            case "ftTrue12": {
                question = firstExamTicket.question13();
                break;
            }
            case "ftAnswer13":
            case "ftTrue13": {
                question = firstExamTicket.question14();
                break;
            }
            case "ftAnswer14":
            case "ftTrue14": {
                question = firstExamTicket.question15();
                break;
            }
            case "ftAnswer15":
            case "ftTrue15": {
                question = firstExamTicket.question16();
                break;
            }
            case "ftAnswer16":
            case "ftTrue16": {
                question = firstExamTicket.question17();
                break;
            }
            case "ftAnswer17":
            case "ftTrue17": {
                question = firstExamTicket.question18();
                break;
            }
            case "ftAnswer18":
            case "ftTrue18": {
                question = firstExamTicket.question19();
                break;
            }
            case "ftAnswer19":
            case "ftTrue19": {
                question = firstExamTicket.question20();
                break;
            }
            case "scAnswer1":
            case "scTrue1": {
                question = secondExamTicket.question2();
                break;
            }
            case "scAnswer2":
            case "scTrue2": {
                question = secondExamTicket.question3();
                break;
            }
            case "scAnswer3":
            case "scTrue3": {
                question = secondExamTicket.question4();
                break;
            }
            case "scAnswer4":
            case "scTrue4": {
                question = secondExamTicket.question5();
                break;
            }
            case "scAnswer5":
            case "scTrue5": {
                question = secondExamTicket.question6();
                break;
            }
            case "scAnswer6":
            case "scTrue6": {
                question = secondExamTicket.question7();
                break;
            }
            case "scAnswer7":
            case "scTrue7": {
                question = secondExamTicket.question8();
                break;
            }
            case "scAnswer8":
            case "scTrue8": {
                question = secondExamTicket.question9();
                break;
            }
            case "scAnswer9":
            case "scTrue9": {
                question = secondExamTicket.question10();
                break;
            }
            case "scAnswer10":
            case "scTrue10": {
                question = secondExamTicket.question11();
                break;
            }
            case "scAnswer11":
            case "scTrue11": {
                question = secondExamTicket.question12();
                break;
            }
            case "scAnswer12":
            case "scTrue12": {
                question = secondExamTicket.question13();
                break;
            }
            case "scAnswer13":
            case "scTrue13": {
                question = secondExamTicket.question14();
                break;
            }
            case "scAnswer14":
            case "scTrue14": {
                question = secondExamTicket.question15();
                break;
            }
            case "scAnswer15":
            case "scTrue15": {
                question = secondExamTicket.question16();
                break;
            }
            case "scAnswer16":
            case "scTrue16": {
                question = secondExamTicket.question17();
                break;
            }
            case "scAnswer17":
            case "scTrue17": {
                question = secondExamTicket.question18();
                break;
            }
            case "scAnswer18":
            case "scTrue18": {
                question = secondExamTicket.question19();
                break;
            }
            case "scAnswer19":
            case "scTrue19": {
                question = secondExamTicket.question20();
                break;
            }
            case "thAnswer1":
            case "thTrue1": {
                question = thirdExamTicket.question2();
                break;
            }
            case "thAnswer2":
            case "thTrue2": {
                question = thirdExamTicket.question3();
                break;
            }
            case "thAnswer3":
            case "thTrue3": {
                question = thirdExamTicket.question4();
                break;
            }
            case "thAnswer4":
            case "thTrue4": {
                question = thirdExamTicket.question5();
                break;
            }
            case "thAnswer5":
            case "thTrue5": {
                question = thirdExamTicket.question6();
                break;
            }
            case "thAnswer6":
            case "thTrue6": {
                question = thirdExamTicket.question7();
                break;
            }
            case "thAnswer7":
            case "thTrue7": {
                question = thirdExamTicket.question8();
                break;
            }
            case "thAnswer8":
            case "thTrue8": {
                question = thirdExamTicket.question9();
                break;
            }
            case "thAnswer9":
            case "thTrue9": {
                question = thirdExamTicket.question10();
                break;
            }
            case "thAnswer10":
            case "thTrue10": {
                question = thirdExamTicket.question11();
                break;
            }
            case "thAnswer11":
            case "thTrue11": {
                question = thirdExamTicket.question12();
                break;
            }
            case "thAnswer12":
            case "thTrue12": {
                question = thirdExamTicket.question13();
                break;
            }
            case "thAnswer13":
            case "thTrue13": {
                question = thirdExamTicket.question14();
                break;
            }
            case "thAnswer14":
            case "thTrue14": {
                question = thirdExamTicket.question15();
                break;
            }
            case "thAnswer15":
            case "thTrue15": {
                question = thirdExamTicket.question16();
                break;
            }
            case "thAnswer16":
            case "thTrue16": {
                question = thirdExamTicket.question17();
                break;
            }
            case "thAnswer17":
            case "thTrue17": {
                question = thirdExamTicket.question18();
                break;
            }
            case "thAnswer18":
            case "thTrue18": {
                question = thirdExamTicket.question19();
                break;
            }
            case "thAnswer19":
            case "thTru1e9": {
                question = thirdExamTicket.question20();
                break;
            }

            case "foAnswer1":
            case "foTrue1": {
                question = fourthExamTicket.question2();
                break;
            }
            case "foAnswer2":
            case "foTrue2": {
                question = fourthExamTicket.question3();
                break;
            }
            case "foAnswer3":
            case "foTrue3": {
                question = fourthExamTicket.question4();
                break;
            }
            case "foAnswer4":
            case "foTrue4": {
                question = fourthExamTicket.question5();
                break;
            }
            case "foAnswer5":
            case "foTrue5": {
                question = fourthExamTicket.question6();
                break;
            }
            case "foAnswer6":
            case "foTrue6": {
                question = fourthExamTicket.question7();
                break;
            }
            case "foAnswer7":
            case "foTrue7": {
                question = fourthExamTicket.question8();
                break;
            }
            case "foAnswer8":
            case "foTrue8": {
                question = fourthExamTicket.question9();
                break;
            }
            case "foAnswer9":
            case "foTrue9": {
                question = fourthExamTicket.question10();
                break;
            }
            case "foAnswer10":
            case "foTrue10": {
                question = fourthExamTicket.question11();
                break;
            }
            case "foAnswer11":
            case "foTrue11": {
                question = fourthExamTicket.question12();
                break;
            }
            case "foAnswer12":
            case "foTrue12": {
                question = fourthExamTicket.question13();
                break;
            }
            case "foAnswer13":
            case "foTrue13": {
                question = fourthExamTicket.question14();
                break;
            }
            case "foAnswer14":
            case "foTrue14": {
                question = fourthExamTicket.question15();
                break;
            }
            case "foAnswer15":
            case "foTrue15": {
                question = fourthExamTicket.question16();
                break;
            }
            case "foAnswer16":
            case "foTrue16": {
                question = fourthExamTicket.question17();
                break;
            }
            case "foAnswer17":
            case "foTrue17": {
                question = fourthExamTicket.question18();
                break;
            }
            case "foAnswer18":
            case "foTrue18": {
                question = fourthExamTicket.question19();
                break;
            }
            case "foAnswer19":
            case "foTrue19": {
                question = fourthExamTicket.question20();
                break;
            }

            case "fiAnswer1":
            case "fiTrue1": {
                question = fifthExamTicket.question2();
                break;
            }
            case "fiAnswer2":
            case "fiTrue2": {
                question = fifthExamTicket.question3();
                break;
            }
            case "fiAnswer3":
            case "fiTrue3": {
                question = fifthExamTicket.question4();
                break;
            }
            case "fiAnswer4":
            case "fiTrue4": {
                question = fifthExamTicket.question5();
                break;
            }
            case "fiAnswer5":
            case "fiTrue5": {
                question = fifthExamTicket.question6();
                break;
            }
            case "fiAnswer6":
            case "fiTrue6": {
                question = fifthExamTicket.question7();
                break;
            }
            case "fiAnswer7":
            case "fiTrue7": {
                question = fifthExamTicket.question8();
                break;
            }
            case "fiAnswer8":
            case "fiTrue8": {
                question = fifthExamTicket.question9();
                break;
            }
            case "fiAnswer9":
            case "fiTrue9": {
                question = fifthExamTicket.question10();
                break;
            }
            case "fiAnswer10":
            case "fiTrue10": {
                question = fifthExamTicket.question11();
                break;
            }
            case "fiAnswer11":
            case "fiTrue11": {
                question = fifthExamTicket.question12();
                break;
            }
            case "fiAnswer12":
            case "fiTrue12": {
                question = fifthExamTicket.question13();
                break;
            }
            case "fiAnswer13":
            case "fiTrue13": {
                question = fifthExamTicket.question14();
                break;
            }
            case "fiAnswer14":
            case "fiTrue14": {
                question = fifthExamTicket.question15();
                break;
            }
            case "fiAnswer15":
            case "fiTrue15": {
                question = fifthExamTicket.question16();
                break;
            }
            case "fiAnswer16":
            case "fiTrue16": {
                question = fifthExamTicket.question17();
                break;
            }
            case "fiAnswer17":
            case "fiTrue17": {
                question = fifthExamTicket.question18();
                break;
            }
            case "fiAnswer18":
            case "fiTrue18": {
                question = fifthExamTicket.question19();
                break;
            }
            case "fiAnswer19":
            case "fiTrue19": {
                question = fifthExamTicket.question20();
                break;
            }
        }
        return question;
    }
}
