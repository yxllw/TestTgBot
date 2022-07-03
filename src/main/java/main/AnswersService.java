package main;

import main.tickets.*;
import main.topicTickets.*;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.methods.send.SendPhoto;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageReplyMarkup;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public class AnswersService {
    CallbackQuery callbackQuery;
    private final String ANSWER = "Поздравляю, Вы ответили на все билеты по этой теме. Чтобы выйти в главное меню введите /start";
    private final String TICKETANSWER = "Поздравляю, Вы ответили на все вопросы в этом билете. Чтобы выйти в главное меню введите /start";
    EditMessageReplyMarkup editMessageReplyMarkup = new EditMessageReplyMarkup();
    SendPhoto sendPhoto = new SendPhoto();
    public AnswersService(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }
    public EditMessageReplyMarkup getAnswer() {
        GeneralProvisions generalProvisions = new GeneralProvisions(callbackQuery);
        RoadMarks roadMarks = new RoadMarks(callbackQuery);
        RoadSigns roadSigns = new RoadSigns(callbackQuery);
        TrafficSignals trafficSignals = new TrafficSignals(callbackQuery);
        Drive drive = new Drive(callbackQuery);
        Speed speed = new Speed(callbackQuery);
        Overtaking overtaking = new Overtaking(callbackQuery);
        Parking parking = new Parking(callbackQuery);
        Crossroad crossroad = new Crossroad(callbackQuery);
        LightsHorn lightsHorn = new LightsHorn(callbackQuery);
        Maintenance maintenance = new Maintenance(callbackQuery);
        SafeDrive safeDrive = new SafeDrive(callbackQuery);
        FirstAid firstAid = new FirstAid(callbackQuery);
        Responsibility responsibility = new Responsibility(callbackQuery);
        DriveOrder driveOrder = new DriveOrder(callbackQuery);
        Bus bus = new Bus(callbackQuery);
        Tow tow = new Tow(callbackQuery);
        SpecialSignals specialSignals = new SpecialSignals(callbackQuery);
        Highway highway = new Highway(callbackQuery);
        TrainingBicycle trainingBicycle = new TrainingBicycle(callbackQuery);
        ResidentialArea residentialArea = new ResidentialArea(callbackQuery);
        Railway railway = new Railway(callbackQuery);
        Crossings crossings = new Crossings(callbackQuery);
        Transportation transportation = new Transportation(callbackQuery);
        DriversResponsibility driversResponsibility = new DriversResponsibility(callbackQuery);
        Emergency emergency = new Emergency(callbackQuery);

        FirstTicket firstTicket = new FirstTicket(callbackQuery);
        SecondTicket secondTicket = new SecondTicket(callbackQuery);
        ThirdTicket thirdTicket = new ThirdTicket(callbackQuery);
        FourthTicket fourthTicket = new FourthTicket(callbackQuery);
        FifthTicket fifthTicket = new FifthTicket(callbackQuery);
        String answer = callbackQuery.getData();
        switch (answer) {
            case "tsSec1": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupSec1();
                break;
            }
            case "tsTh1": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupTh1();
                break;
            }
            case "tsSec2": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupSec2(); break;
            }
            case "tsTh2": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupTh2(); break;
            }
            case "tsFo2": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupFo2(); break;
            }
            case "tsFir3": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupFir3(); break;
            }
            case "tsTh3": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupTh3(); break;
            }
            case "tsFir4": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupFir4();
                break;
            }
            case "tsTh4": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupTh4();
                break;
            }
            case "tsSec5": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupSec5();
                break;
            }
            case "tsTh5": {
                editMessageReplyMarkup = trafficSignals.editMessageReplyMarkupTh5();
                break;
            }
            case "drSec1": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupSec1(); break;
            }
            case "drTh1": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupTh1(); break;
            }
            case "drSec2": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupSec2(); break;
            }
            case "drTh2": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupTh2(); break;
            }
            case "drSec3": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupSec3(); break;
            }
            case "drTh3": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupTh3(); break;
            }
            case "drFir4": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupFir4(); break;
            }
            case "drTh4": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupTh4(); break;
            }
            case "drSec5": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupSec5(); break;
            }
            case "drTh5": {
                editMessageReplyMarkup = drive.editMessageReplyMarkupTh5(); break;
            }

            case "spFir1": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFir1(); break;
            }
            case "spSec1": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupSec1(); break;
            }
            case "spFir2": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFir2(); break;
            }
            case "spSec2": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupSec2(); break;
            }
            case "spFo2": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFo2();break;
            }
            case "spFir3": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFir3(); break;
            }
            case "spSec3": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupSec3(); break;
            }
            case "spFir4": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFir4(); break;
            }
            case "spTh4": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupTh4(); break;
            }
            case "spFir5": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFir5(); break;
            }
            case "spSec5": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupSec5(); break;
            }
            case "spFo5": {
                editMessageReplyMarkup = speed.editMessageReplyMarkupFo5();break;
            }


            case "ogSec1": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupSec1(); break;
            }
            case "ogTh1": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupTh1(); break;
            }
            case "ogSec2": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupSec2(); break;
            }
            case "ogTh2": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupTh2(); break;
            }
            case "ogSec3": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupSec3(); break;
            }
            case "ogTh3": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupTh3(); break;
            }
            case "ogFir4": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupFir4(); break;
            }
            case "ogTh4": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupTh4(); break;
            }
            case "ogSec5": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupSec5(); break;
            }
            case "ogFir5": {
                editMessageReplyMarkup = overtaking.editMessageReplyMarkupFir5(); break;
            }

            case "pgFir1": {
                editMessageReplyMarkup =  parking.editMessageReplyMarkupFir1(); break;
            }
            case "pgSec1": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupSec1(); break;
            }
            case "pgFir2": {
                editMessageReplyMarkup =  parking.editMessageReplyMarkupFir2(); break;
            }
            case "pgSec2": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupSec2(); break;
            }
            case "pgFo2": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupFo2(); break;
            }
            case "pgFir3": {
                editMessageReplyMarkup =  parking.editMessageReplyMarkupFir3(); break;
            }
            case "pgSec3": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupSec3(); break;
            }
            case "pgTh4": {
                editMessageReplyMarkup =  parking.editMessageReplyMarkupTh4(); break;
            }
            case "pgSec4": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupSec4(); break;
            }
            case "pgFir5": {
                editMessageReplyMarkup =  parking.editMessageReplyMarkupFir5(); break;
            }
            case "pgTh5": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupTh5(); break;
            }
            case "pgFo5": {
                editMessageReplyMarkup = parking.editMessageReplyMarkupFo5(); break;
            }


            case "cdFir1": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFir1(); break;
            }
            case "cdSec1": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupSec1(); break;
            }
            case "cdFo1": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFo1(); break;
            }
            case "cdFir2": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFir2(); break;
            }
            case "cdSec2": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupSec2(); break;
            }
            case "cdFir3": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFir3(); break;
            }
            case "cdTh3": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupTh3(); break;
            }
            case "cdTh4": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupTh4(); break;
            }
            case "cdSec4": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupSec4(); break;
            }
            case "cdFo4": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFo4(); break;
            }
            case "cdFir5": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupFir5(); break;
            }
            case "cdTh5": {
                editMessageReplyMarkup = crossroad.editMessageReplyMarkupTh5(); break;
            }

            case "lhFir1": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupFir1(); break;
            }
            case "lhTh1": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupTh1(); break;
            }
            case "lhFir2": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupFir2(); break;
            }
            case "lhTh2": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupTh2(); break;
            }
            case "lhFir3": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupFir3(); break;
            }
            case "lhTh3": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupTh3(); break;
            }
            case "lhFir4": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupFir4(); break;
            }
            case "lhSec4": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupSec4(); break;
            }
            case "lhFir5": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupFir5(); break;
            }
            case "lhTh5": {
                editMessageReplyMarkup = lightsHorn.EditMessageReplyMarkupTh5(); break;
            }

            case "meFir1": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupFir1(); break;
            }
            case "meTh1": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupTh1(); break;
            }
            case "meFir2": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupFir2(); break;
            }
            case "meTh2": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupTh2(); break;
            }
            case "meFir3": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupFir3(); break;
            }
            case "meSec3": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupSec3(); break;
            }
            case "meFir4": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupFir4(); break;
            }
            case "meSec4": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupSec4(); break;
            }
            case "meFir5": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupFir5(); break;
            }
            case "meTh5": {
                editMessageReplyMarkup = maintenance.EditMessageReplyMarkupTh5(); break;
            }


            case "sdFir1": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupFir1(); break;
            }
            case "sdTh1": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupTh1(); break;
            }
            case "sdFir2": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupFir2(); break;
            }
            case "sdTh2": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupTh2(); break;
            }
            case "sdFir3": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupFir3(); break;
            }
            case "sdSec3": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupSec3(); break;
            }
            case "sdSec4": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupSec4(); break;
            }
            case "sdTh4": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupTh4(); break;
            }
            case "sdFir5": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupFir5(); break;
            }
            case "sdTh5": {
                editMessageReplyMarkup = safeDrive.EditMessageReplyMarkupTh5(); break;
            }

            case "faFir1": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupFir1(); break;
            }
            case "faTh1": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupTh1(); break;
            }
            case "faSec2": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupSec2(); break;
            }
            case "faTh2": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupTh2(); break;
            }
            case "faFir3": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupFir3(); break;
            }
            case "faSec3": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupSec3(); break;
            }
            case "faFir4": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupFir4(); break;
            }
            case "faTh4": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupTh4(); break;
            }
            case "faFir5": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupFir5(); break;
            }
            case "faTh5": {
                editMessageReplyMarkup = firstAid.EditMessageReplyMarkupTh5(); break;
            }

            case "ryFir1": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupFir1(); break;
            }
            case "rySec1": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupSec1(); break;
            }
            case "ryTh1": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupTh1(); break;
            }
            case "ryFir2": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupFir2(); break;
            }
            case "rySec2": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupSec2(); break;
            }
            case "ryTh2": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupTh2(); break;
            }
            case "ryFir3": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupFir3(); break;
            }
            case "ryTh3": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupTh3(); break;
            }
            case "ryFo3": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupFo3(); break;
            }
            case "ryFir4": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupFir4(); break;
            }
            case "rySec4": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupSec4(); break;
            }
            case "rySec5": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupSec5(); break;
            }
            case "ryTh5": {
                editMessageReplyMarkup = responsibility.EditMessageReplyMarkupTh5(); break;
            }

            case "doFir1": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFir1(); break;
            }
            case "doTh1": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupTh1(); break;
            }
            case "doFir2": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFir2(); break;
            }
            case "doSec2": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupSec2(); break;
            }
            case "doFir3": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFir3(); break;
            }
            case "doTh3": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupTh3(); break;
            }
            case "doFir4": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFir4(); break;
            }
            case "doTh4": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupTh4(); break;
            }
            case "doFo4": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFo4(); break;
            }
            case "doFir5": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupFir5(); break;
            }
            case "doSec5": {
                editMessageReplyMarkup = driveOrder.EditMessageReplyMarkupSec5(); break;
            }

            case "busFir1": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupFir1(); break;
            }
            case "busSec1": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupSec1(); break;
            }
            case "busFir2": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupFir2(); break;
            }
            case "busTh2": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupTh2(); break;
            }
            case "busFir3": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupFir3(); break;
            }
            case "busSec3": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupSec3(); break;
            }
            case "busFir4": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupFir4(); break;
            }
            case "busSec4": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupSec4(); break;
            }
            case "busTh4": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupTh4(); break;
            }
            case "busSec5": {
                editMessageReplyMarkup = bus.EditMessageReplyMarkupSec5(); break;
            }


            case "towFir1": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupFir1(); break;
            }
            case "towSec1": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupSec1(); break;
            }
            case "towFir2": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupFir2(); break;
            }
            case "towTh2": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupTh2(); break;
            }
            case "towFir3": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupFir3(); break;
            }
            case "towTh3": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupTh3(); break;
            }
            case "towFir4": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupFir4(); break;
            }
            case "towTh4": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupTh4(); break;
            }
            case "towSec5": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupSec5(); break;
            }
            case "towTh5": {
                editMessageReplyMarkup = tow.EditMessageReplyMarkupTh5(); break;
            }

            case "ssSec1": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupSec1(); break;
            }
            case "ssTh1": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupTh1(); break;
            }
            case "ssFir2": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupFir2(); break;
            }
            case "ssTh2": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupTh2(); break;
            }
            case "ssFir3": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupFir3(); break;
            }
            case "ssSec3": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupSec3(); break;
            }
            case "ssFir4": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupFir4(); break;
            }
            case "ssSec4": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupSec4(); break;
            }
            case "ssFo3": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupFo3(); break;
            }
            case "ssFir5": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupFir5(); break;
            }
            case "ssTh5": {
                editMessageReplyMarkup = specialSignals.EditMessageReplyMarkupTh5(); break;
            }

            case "hwFir1": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupFir1(); break;
            }
            case "hwSec1": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupSec1(); break;
            }
            case "hwFir2": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupFir2(); break;
            }
            case "hwSec2": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupSec2(); break;
            }
            case "hwTh3": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupTh3(); break;
            }
            case "hwSec3": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupSec3(); break;
            }
            case "hwFir4": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupFir4(); break;
            }
            case "hwSec4": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupSec4(); break;
            }
            case "hwFir5": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupFir5(); break;
            }
            case "hwTh5": {
                editMessageReplyMarkup = highway.EditMessageReplyMarkupTh5(); break;
            }

            case "tbFir1": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupFir1(); break;
            }
            case "tbSec1": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupSec1(); break;
            }
            case "tbTh1": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupTh1(); break;
            }
            case "tbFir2": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupFir2(); break;
            }
            case "tbSec2": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupSec2(); break;
            }
            case "tbFir3": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupFir3(); break;
            }
            case "tbSec3": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupSec3(); break;
            }
            case "tbTh3": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupTh3(); break;
            }
            case "tbFir4": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupFir4(); break;
            }
            case "tbSec4": {
                editMessageReplyMarkup = trainingBicycle.EditMessageReplyMarkupSec4(); break;
            }

            case "raFir1": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupFir1(); break;
            }
            case "raSec1": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupSec1(); break;
            }
            case "raTh1": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupTh1(); break;
            }
            case "raFir2": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupFir2(); break;
            }
            case "raSec2": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupSec2(); break;
            }
            case "raFir3": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupFir3(); break;
            }
            case "raTh3": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupTh3(); break;
            }
            case "raFir4": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupFir4(); break;
            }
            case "raSec4": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupSec4(); break;
            }
            case "raTh4": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupTh4(); break;
            }
            case "raFir5": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupFir5(); break;
            }
            case "raSec5": {
                editMessageReplyMarkup = residentialArea.EditMessageReplyMarkupSec5(); break;
            }

            case "rwFir1": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupFir1(); break;
            }
            case "rwSec1": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupSec1(); break;
            }
            case "rwFir2": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupFir2(); break;
            }
            case "rwSec2": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupSec2(); break;
            }
            case "rwTh3": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupTh3(); break;
            }
            case "rwSec3": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupSec3(); break;
            }
            case "rwFir4": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupFir4(); break;
            }
            case "rwFir5": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupFir5(); break;
            }
            case "rwSec5": {
                editMessageReplyMarkup = railway.EditMessageReplyMarkupSec5(); break;
            }

            case "csFir1": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupFir1(); break;
            }
            case "csSec1": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupSec1(); break;
            }
            case "csFir2": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupFir2(); break;
            }
            case "csSec2": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupSec2(); break;
            }
            case "csFir3": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupFir3(); break;
            }
            case "csTh3": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupTh3(); break;
            }
            case "csFir4": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupFir4(); break;
            }
            case "csSec4": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupSec4(); break;
            }
            case "csSec5": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupSec5(); break;
            }
            case "csTh5": {
                editMessageReplyMarkup = crossings.EditMessageReplyMarkupTh5(); break;
            }

            case "tnFir1": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupFir1(); break;
            }
            case "tnSec1": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupSec1(); break;
            }
            case "tnFir2": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupFir2(); break;
            }
            case "tnSec2": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupSec2(); break;
            }
            case "tnSec3": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupSec3(); break;
            }
            case "tnTh3": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupTh3(); break;
            }
            case "tnFir4": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupFir4(); break;
            }
            case "tnTh4": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupTh4(); break;
            }
            case "tnFir5": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupFir5(); break;
            }
            case "tnSec5": {
                editMessageReplyMarkup = transportation.EditMessageReplyMarkupSec5(); break;
            }

            case "dyFir1": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupFir1(); break;
            }
            case "dySec1": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupSec1(); break;
            }
            case "dyFir2": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupFir2(); break;
            }
            case "dyTh2": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupTh2(); break;
            }
            case "dyFir3": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupFir3(); break;
            }
            case "dySec3": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupSec3(); break;
            }
            case "dyFir4": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupFir4(); break;
            }
            case "dySec4": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupSec4(); break;
            }
            case "dyFir5": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupFir5(); break;
            }
            case "dyTh5": {
                editMessageReplyMarkup = driversResponsibility.EditMessageReplyMarkupTh5(); break;
            }

            case "eySec1": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupSec1(); break;
            }
            case "eyTh1": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupTh1(); break;
            }
            case "eySec2": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupSec2(); break;
            }
            case "eyFir2": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupFir2(); break;
            }
            case "eyFir3": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupFir3(); break;
            }
            case "eyTh3": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupTh3(); break;
            }
            case "eyFo3": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupFo3(); break;
            }
            case "eySec4": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupSec4(); break;
            }
            case "eyTh4": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupTh4(); break;
            }
            case "eySec5": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupSec5(); break;
            }
            case "eyFir5": {
                editMessageReplyMarkup = emergency.EditMessageReplyMarkupFir5(); break;
            }
        }
        switch (answer) {
            case "gpFir1": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupFir1();
                break;
            }
            case "gpSec1": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupSec1();
                break;
            }
            case "gpFir2": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupFir2();
                break;
            }
            case "gpTh2": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupTh2();
                break;
            }
            case "gpSec3": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupSec3();
                break;
            }
            case "gpTh3": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupTh3();
                break;
            }
            case "gpFir4": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupFir4();
                break;
            }
            case "gpTh4": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupTh4();
                break;
            }
            case "gpSec5": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupSec5();
                break;
            }
            case "gpTh5": {
                editMessageReplyMarkup = generalProvisions.editMessageReplyMarkupTh5();
                break;
            }


            case "rmSec1": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupSec1();
                break;
            }
            case "rmTh1": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupTh1();
                break;
            }
            case "rmFir2": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupFir2();
                break;
            }
            case "rmTh2": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupTh2();
                break;
            }
            case "rmFo2": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupFo2();
                break;
            }
            case "rmFir3": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupFir3();
                break;
            }
            case "rmSec3": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupSec3();
                break;
            }
            case "rmFir4": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupFir4();
                break;
            }
            case "rmTh4": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupTh4();
                break;
            }
            case "rmFir5": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupFir5();
                break;
            }
            case "rmTh5": {
                editMessageReplyMarkup = roadMarks.editMessageReplyMarkupTh5();
                break;
            }


            case "rsSec1": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupSec1();
                break;
            }
            case "rsTh1": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupTh1();
                break;
            }
            case "rsSec2": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupSec2();
                break;
            }
            case "rsTh2": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupTh2();
                break;
            }
            case "rsFir3": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupFir3();break;
            }
            case "rsSec3": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupSec3();
                break;
            }
            case "rsFir4": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupFir4();break;
            }
            case "rsTh4": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupTh4();break;
            }
            case "rsFir5": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupFir5();break;
            }
            case "rsTh5": {
                editMessageReplyMarkup = roadSigns.editMessageReplyMarkupTh5();break;
            }


            case "ftFir1": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir1();
                break;
            }
            case "ftTh1": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh1();
                break;
            }
            case "ftSec2": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec2();
                break;
            }
            case "ftTh2": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh2();
                break;
            }
            case "ftSec3": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec3();
                break;
            }
            case "ftTh3": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh3();
                break;
            }
            case "ftFo3": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFo3();
                break;
            }
            case "ftFir4": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir4();
                break;
            }
            case "ftSec4": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec4();
                break;
            }
            case "ftFir5": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir5();
                break;
            }
            case "ftSec5": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec5();
                break;
            }
            case "ftSec6": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec6();
                break;
            }
            case "ftTh6": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh6();
                break;
            }
            case "ftFir7": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir7();
                break;
            }
            case "ftSec7": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec7();
                break;
            }
            case "ftFir8": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir8();
                break;
            }
            case "ftSec8": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec8();
                break;
            }
            case "ftSec9": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec9();
                break;
            }
            case "ftTh9": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh9();
                break;
            }
            case "ftFir10": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir10();
                break;
            }
            case "ftSec10": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec10();
                break;
            }
            case "ftFo10": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFo10();
                break;
            }
            case "ftFir11": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir11();
                break;
            }
            case "ftSec11": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec11();
                break;
            }
            case "ftFir12": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir12();
                break;
            }
            case "ftTh12": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh12();
                break;
            }
            case "ftFir13": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir13();
                break;
            }
            case "ftSec13": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec13();
                break;
            }
            case "ftFir14": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir14();
                break;
            }
            case "ftSec14": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec14();
                break;
            }
            case "ftSec15": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec15();
                break;
            }
            case "ftFir16": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir16();
                break;
            }
            case "ftSec16": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec16();
                break;
            }
            case "ftFir17": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir17();
                break;
            }
            case "ftTh17": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh17();
                break;
            }
            case "ftFo17": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFo17();
                break;
            }
            case "ftSec18": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec18();
                break;
            }
            case "ftTh18": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupTh18();
                break;
            }
            case "ftFo18": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFo18();
                break;
            }
            case "ftFir19": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir19();
                break;
            }
            case "ftSec19": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec19();
                break;
            }
            case "ftFir20": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupFir20();
                break;
            }
            case "ftSec20": {
                editMessageReplyMarkup = firstTicket.editMessageReplyMarkupSec20();
                break;
            }


            case "scFir1": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir1();
                break;
            }
            case "scTh1": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh1();
                break;
            }
            case "scSec2": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec2();
                break;
            }
            case "scTh2": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh2();
                break;
            }
            case "scSec3": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec3();
                break;
            }
            case "scTh3": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh3();
                break;
            }
            case "scFir4": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir4();
                break;
            }
            case "scSec4": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec4();
                break;
            }
            case "scTh4": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh4();
                break;
            }
            case "scFir5": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir5();
                break;
            }
            case "scTh5": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh5();
                break;
            }
            case "scFo5": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFo5();
                break;
            }
            case "scFir6": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir6();
                break;
            }
            case "scTh6": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh6();
                break;
            }
            case "scFir7": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir7();
                break;
            }
            case "scSec7": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec7();
                break;
            }
            case "scTh7": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh7();
                break;
            }
            case "scFir8": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir8();
                break;
            }
            case "scSec8": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec8();
                break;
            }
            case "scSec9": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec9();
                break;
            }
            case "scTh9": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh9();
                break;
            }
            case "scFir10": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir10();
                break;
            }
            case "scSec10": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec10();
                break;
            }
            case "scSec11": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec11();
                break;
            }
            case "scTh11": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh11();
                break;
            }
            case "scFir12": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir12();
                break;
            }
            case "scSec12": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec12();
                break;
            }
            case "scFir13": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir13();
                break;
            }
            case "scSec13": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec13();
                break;
            }
            case "scFo13": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFo13();
                break;
            }
            case "scSec14": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec14();
                break;
            }
            case "scTh14": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh14();
                break;
            }
            case "scFo14": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFo14();
                break;
            }
            case "scFir15": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir15();
                break;
            }
            case "scSec15": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec15();
                break;
            }
            case "scFir16": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir16();
                break;
            }
            case "scSec16": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec16();
                break;
            }
            case "scTh16": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh16();
                break;
            }
            case "scFir17": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir17();
                break;
            }
            case "scSec17": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec17();
                break;
            }
            case "scFir18": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir18();
                break;
            }
            case "scSec18": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec18();
                break;
            }
            case "scTh18": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh18();
                break;
            }
            case "scFir19": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir19();
                break;
            }
            case "scSec19": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupSec19();
                break;
            }
            case "scTh20": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupTh20();
                break;
            }
            case "scFir20": {
                editMessageReplyMarkup = secondTicket.editMessageReplyMarkupFir20();
                break;
            }


            case "thSec1": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec1(); break;
            }
            case "thTh1": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh1(); break;
            }
            case "thSec2": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec2(); break;
            }
            case "thFir2": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir2(); break;
            }
            case "thFir3": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir3(); break;
            }
            case "thSec3": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec3(); break;
            }
            case "thFir4": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir4(); break;
            }
            case "thTh4": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh4(); break;
            }
            case "thFo4": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFo4(); break;
            }
            case "thFir5": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir5(); break;
            }
            case "thTh5": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh5(); break;
            }
            case "thFir6": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir6(); break;
            }
            case "thSec6": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec6(); break;
            }
            case "thFir7": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir7(); break;
            }
            case "thTh7": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh7(); break;
            }
            case "thSec8": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec8(); break;
            }
            case "thTh8": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh8(); break;
            }
            case "thFir9": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir9(); break;
            }
            case "thSec9": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec9(); break;
            }
            case "thTh10": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh10(); break;
            }
            case "thSec10": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec10(); break;
            }
            case "thFir11": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir11(); break;
            }
            case "thSec11": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec11(); break;
            }
            case "thTh12": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh12(); break;
            }
            case "thFir12": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir12(); break;
            }
            case "thFo12": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFo12(); break;
            }
            case "thFir13": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir13(); break;
            }
            case "thTh13": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh13(); break;
            }
            case "thTh14": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh14(); break;
            }
            case "thSec14": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec14(); break;
            }
            case "thFir15": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir15(); break;
            }
            case "thSec15": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec15(); break;
            }
            case "thFo15": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFo15(); break;
            }
            case "thFir16": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir16(); break;
            }
            case "thSec16": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec16(); break;
            }
            case "thFir17": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir17(); break;
            }
            case "thSec17": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec17(); break;
            }
            case "thTh17": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh17(); break;
            }
            case "thFir18": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir18(); break;
            }
            case "thTh18": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupTh18(); break;
            }
            case "thFir19": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir19(); break;
            }
            case "thSec19": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec19(); break;
            }
            case "thFo19": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFo19(); break;
            }
            case "thFir20": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupFir20(); break;
            }
            case "thSec20": {
                editMessageReplyMarkup = thirdTicket.EditMessageReplyMarkupSec20(); break;
            }

            case "foFir1": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir1(); break;
            }
            case "foSec1": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec1(); break;
            }
            case "foFir2": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir2(); break;
            }
            case "foTh2": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh2(); break;
            }
            case "foFir3": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir3(); break;
            }
            case "foSec3": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec3(); break;
            }
            case "foFo3": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFo3(); break;
            }
            case "foFir4": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir4(); break;
            }
            case "foSec4": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec4(); break;
            }
            case "foFir5": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir5(); break;
            }
            case "foTh5": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh5(); break;
            }
            case "foSec6": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec6(); break;
            }
            case "foTh6": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh6(); break;
            }
            case "foSec7": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec7(); break;
            }
            case "foTh7": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh7(); break;
            }
            case "foFir8": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir8(); break;
            }
            case "foTh8": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh8(); break;
            }
            case "foFir9": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir9(); break;
            }
            case "foSec9": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec9(); break;
            }
            case "foFir10": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir10(); break;
            }
            case "foSec10": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec10(); break;
            }
            case "foSec11": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec11(); break;
            }
            case "foTh11": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh11(); break;
            }
            case "foFir12": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir12(); break;
            }
            case "foSec12": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec12(); break;
            }
            case "foFir13": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir13(); break;
            }
            case "foSec13": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec13(); break;
            }
            case "foFir14": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir14(); break;
            }
            case "foTh14": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh14(); break;
            }
            case "foFir15": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir15(); break;
            }
            case "foTh15": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh15(); break;
            }
            case "foFir16": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir16(); break;
            }
            case "foSec16": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec16(); break;
            }
            case "foFir17": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir17(); break;
            }
            case "foSec17": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec17(); break;
            }
            case "foFir18": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir18(); break;
            }
            case "foSec18": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec18(); break;
            }
            case "foTh18": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh18(); break;
            }
            case "foSec19": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupSec19(); break;
            }
            case "foTh19": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh19(); break;
            }
            case "foFo19": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFo19(); break;
            }
            case "foFir20": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupFir20(); break;
            }
            case "foTh20": {
                editMessageReplyMarkup = fourthTicket.EditMessageReplyMarkupTh20(); break;
            }

            case "fiFir1": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir1(); break;
            }
            case "fiTh1": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh1(); break;
            }
            case "fiSec2": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec2(); break;
            }
            case "fiTh2": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh2(); break;
            }
            case "fiFir3": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir3(); break;
            }
            case "fiSec3": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec3(); break;
            }
            case "fiFir4": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir4(); break;
            }
            case "fiTh4": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh4(); break;
            }
            case "fiFir5": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir5(); break;
            }
            case "fiSec5": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec5(); break;
            }
            case "fiSec6": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec6(); break;
            }
            case "fiTh6": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh6(); break;
            }
            case "fiFir7": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir7(); break;
            }
            case "fiSec7": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec7(); break;
            }
            case "fiSec8": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec8(); break;
            }
            case "fiFir9": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir9(); break;
            }
            case "fiSec9": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec9(); break;
            }
            case "fiTh9": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh9(); break;
            }
            case "fiFir10": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir10(); break;
            }
            case "fiSec10": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec10(); break;
            }
            case "fiTh10": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh10(); break;
            }
            case "fiFir11": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir11(); break;
            }
            case "fiSec11": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec11(); break;
            }
            case "fiFir12": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir12(); break;
            }
            case "fiSec12": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec12(); break;
            }
            case "fiFir13": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir13(); break;
            }
            case "fiSec13": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec13(); break;
            }
            case "fiTh13": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh13(); break;
            }
            case "fiFir14": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir14(); break;
            }
            case "fiTh14": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh14(); break;
            }
            case "fiFir15": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir15(); break;
            }
            case "fiSec15": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec15(); break;
            }
            case "fiSec16": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec16(); break;
            }
            case "fiTh16": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh16(); break;
            }
            case "fiFir17": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir17(); break;
            }
            case "fiTh17": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh17(); break;
            }
            case "fiFir18": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir18(); break;
            }
            case "fiSec18": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec18(); break;
            }
            case "fiFir19": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir19(); break;
            }
            case "fiTh19": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupTh19(); break;
            }
            case "fiFir20": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupFir20(); break;
            }
            case "fiSec20": {
                editMessageReplyMarkup = fifthTicket.EditMessageReplyMarkupSec20(); break;
            }

        }
        return editMessageReplyMarkup;
    }
    public SendPhoto getQuestion() {
        GeneralProvisions generalProvisions = new GeneralProvisions(callbackQuery);
        RoadMarks roadMarks = new RoadMarks(callbackQuery);
        RoadSigns roadSigns = new RoadSigns(callbackQuery);
        TrafficSignals trafficSignals = new TrafficSignals(callbackQuery);
        Drive drive = new Drive(callbackQuery);
        Speed speed = new Speed(callbackQuery);
        Overtaking overtaking = new Overtaking(callbackQuery);
        Parking parking = new Parking(callbackQuery);
        Crossroad crossroad = new Crossroad(callbackQuery);
        LightsHorn lightsHorn = new LightsHorn(callbackQuery);
        Maintenance maintenance = new Maintenance(callbackQuery);
        SafeDrive safeDrive = new SafeDrive(callbackQuery);
        FirstAid firstAid = new FirstAid(callbackQuery);
        Responsibility responsibility = new Responsibility(callbackQuery);
        DriveOrder driveOrder = new DriveOrder(callbackQuery);
        Bus bus = new Bus(callbackQuery);
        Tow tow = new Tow(callbackQuery);
        SpecialSignals specialSignals = new SpecialSignals(callbackQuery);
        Highway highway = new Highway(callbackQuery);
        TrainingBicycle trainingBicycle = new TrainingBicycle(callbackQuery);
        ResidentialArea residentialArea = new ResidentialArea(callbackQuery);
        Railway railway = new Railway(callbackQuery);
        Crossings crossings = new Crossings(callbackQuery);
        Transportation transportation = new Transportation(callbackQuery);
        DriversResponsibility driversResponsibility = new DriversResponsibility(callbackQuery);
        Emergency emergency = new Emergency(callbackQuery);

        FirstTicket firstTicket = new FirstTicket(callbackQuery);
        SecondTicket secondTicket = new SecondTicket(callbackQuery);
        ThirdTicket thirdTicket = new ThirdTicket(callbackQuery);
        FourthTicket fourthTicket = new FourthTicket(callbackQuery);
        FifthTicket fifthTicket = new FifthTicket(callbackQuery);
        String question = callbackQuery.getData();
        switch (question) {
            case "gpRight1": {
                sendPhoto = generalProvisions.question2();
                break;
            }
            case "gpRight2": {
                sendPhoto = generalProvisions.question3();
                break;
            }
            case "gpRight3": {
                sendPhoto = generalProvisions.question4();
                break;
            }
            case "gpRight4": {
                sendPhoto = generalProvisions.question5();
                break;
            }
            case "gpRight5": {
            }
            case "tsRight1": {
                sendPhoto = trafficSignals.question2();
                break;
            }
            case "tsRight2": {
                sendPhoto = trafficSignals.question3();
                break;
            }
            case "tsRight3": {
                sendPhoto = trafficSignals.question4();
                break;
            }
            case "tsRight4": {
                sendPhoto = trafficSignals.question5();
                break;
            }



            case "rmRight1": {
                sendPhoto = roadMarks.question2();
                break;
            }
            case "rmRight2": {
                sendPhoto = roadMarks.question3();
                break;
            }
            case "rmRight3": {
                sendPhoto = roadMarks.question4();
                break;
            }
            case "rmRight4": {
                sendPhoto = roadMarks.question5();
                break;
            }
            case "rmRight5": {
            }


            case "rsRight1": {
                sendPhoto = roadSigns.question2();
                break;
            }
            case "rsRight2": {
                sendPhoto = roadSigns.question3();
                break;
            }
            case "rsRight3": {
                sendPhoto = roadSigns.question4();
                break;
            }
            case "rsRight4": {
                sendPhoto = roadSigns.question5();
                break;
            }
            case "rsRight5": {
                //sendPhoto = roadSigns.question6();
                break;
            }

            case "drRight1": {
                sendPhoto = drive.question2(); break;
            }
            case "drRight2": {
                sendPhoto = drive.question3(); break;
            }
            case "drRight3": {
                sendPhoto = drive.question4(); break;
            }
            case "drRight4": {
                sendPhoto = drive.question5(); break;
            }

            case "spRight1": {
                sendPhoto = speed.question2(); break;
            }
            case "spRight2": {
                sendPhoto = speed.question3(); break;
            }
            case "spRight3": {
                sendPhoto = speed.question4(); break;
            }
            case "spRight4": {
                sendPhoto = speed.question5(); break;
            }

            case "ogRight1": {
                sendPhoto = overtaking.overtaking2(); break;
            }
            case "ogRight2": {
                sendPhoto = overtaking.overtaking3(); break;
            }
            case "ogRight3": {
                sendPhoto = overtaking.overtaking4(); break;
            }
            case "ogRight4": {
                sendPhoto = overtaking.overtaking5(); break;
            }

            case "pgRight1": {
                sendPhoto = parking.parking2(); break;
            }
            case "pgRight2": {
                sendPhoto = parking.parking3(); break;
            }
            case "pgRight3": {
                sendPhoto = parking.parking4(); break;
            }
            case "pgRight4": {
                sendPhoto = parking.parking5(); break;
            }

            case "cdRight1": {
                sendPhoto = crossroad.crossroad2(); break;
            }
            case "cdRight2": {
                sendPhoto = crossroad.crossroad3(); break;
            }
            case "cdRight3": {
                sendPhoto = crossroad.crossroad4(); break;
            }
            case "cdRight4": {
                sendPhoto = crossroad.crossroad5(); break;
            }


            case "lhRight1": {
                sendPhoto = lightsHorn.lightsHorn2(); break;
            }
            case "lhRight2": {
                sendPhoto = lightsHorn.lightsHorn3(); break;
            }
            case "lhRight3": {
                sendPhoto = lightsHorn.lightsHorn4(); break;
            }
            case "lhRight4": {
                sendPhoto = lightsHorn.lightsHorn5(); break;
            }

            case "meRight1": {
                sendPhoto = maintenance.maintenance2(); break;
            }
            case "meRight2": {
                sendPhoto = maintenance.maintenance3(); break;
            }
            case "meRight3": {
                sendPhoto = maintenance.maintenance4(); break;
            }
            case "meRight4": {
                sendPhoto = maintenance.maintenance5(); break;
            }


            case "sdRight1": {
                sendPhoto = safeDrive.safeDrive2(); break;
            }
            case "sdRight2": {
                sendPhoto = safeDrive.safeDrive3(); break;
            }
            case "sdRight3": {
                sendPhoto = safeDrive.safeDrive4(); break;
            }
            case "sdRight4": {
                sendPhoto = safeDrive.safeDrive5(); break;
            }


            case "faRight1": {
                sendPhoto = firstAid.firstAid2(); break;
            }
            case "faRight2": {
                sendPhoto = firstAid.firstAid3(); break;
            }
            case "faRight3": {
                sendPhoto = firstAid.firstAid4(); break;
            }
            case "faRight4": {
                sendPhoto = firstAid.firstAid5(); break;
            }

            case "ryRight1": {
                sendPhoto = responsibility.responsibility2(); break;
            }
            case "ryRight2": {
                sendPhoto = responsibility.responsibility3(); break;
            }
            case "ryRight3": {
                sendPhoto = responsibility.responsibility4(); break;
            }
            case "ryRight4": {
                sendPhoto = responsibility.responsibility5(); break;
            }


            case "doRight1": {
                sendPhoto = driveOrder.driveOrder2(); break;
            }
            case "doRight2": {
                sendPhoto = driveOrder.driveOrder3(); break;
            }
            case "doRight3": {
                sendPhoto = driveOrder.driveOrder4(); break;
            }
            case "doRight4": {
                sendPhoto = driveOrder.driveOrder5(); break;
            }

            case "busRight1": {
                sendPhoto = bus.bus2(); break;
            }
            case "busRight2": {
                sendPhoto = bus.bus3(); break;
            }
            case "busRight3": {
                sendPhoto = bus.bus4(); break;
            }
            case "busRight4": {
                sendPhoto = bus.bus5(); break;
            }

            case "towRight1": {
                sendPhoto = tow.tow2(); break;
            }
            case "towRight2": {
                sendPhoto = tow.tow3(); break;
            }
            case "towRight3": {
                sendPhoto = tow.tow4(); break;
            }
            case "towRight4": {
                sendPhoto = tow.tow5(); break;
            }

            case "ssRight1": {
                sendPhoto = specialSignals.specialSignals2(); break;
            }
            case "ssRight2": {
                sendPhoto = specialSignals.specialSignals3(); break;
            }
            case "ssRight3": {
                sendPhoto = specialSignals.specialSignals4(); break;
            }
            case "ssRight4": {
                sendPhoto = specialSignals.specialSignals5(); break;
            }


            case "hwRight1": {
                sendPhoto = highway.highway2(); break;
            }
            case "hwRight2": {
                sendPhoto = highway.highway3(); break;
            }
            case "hwRight3": {
                sendPhoto = highway.highway4(); break;
            }
            case "hwRight4": {
                sendPhoto = highway.highway5(); break;
            }

            case "tbRight1": {
                sendPhoto = trainingBicycle.trainingBicycle2(); break;
            }
            case "tbRight2": {
                sendPhoto = trainingBicycle.trainingBicycle3(); break;
            }
            case "tbRight3": {
                sendPhoto = trainingBicycle.trainingBicycle4(); break;
            }


            case "raRight1": {
                sendPhoto = residentialArea.residentialArea2(); break;
            }
            case "raRight2": {
                sendPhoto = residentialArea.residentialArea3(); break;
            }
            case "raRight3": {
                sendPhoto = residentialArea.residentialArea4(); break;
            }
            case "raRight4": {
                sendPhoto = residentialArea.residentialArea5(); break;
            }

            case "rwRight1": {
                sendPhoto = railway.railway2(); break;
            }
            case "rwRight2": {
                sendPhoto = railway.railway3(); break;
            }
            case "rwRight3": {
                sendPhoto = railway.railway4(); break;
            }
            case "rwRight4": {
                sendPhoto = railway.railway5(); break;
            }

            case "csRight1": {
                sendPhoto = crossings.crossings2(); break;
            }
            case "csRight2": {
                sendPhoto = crossings.crossings3(); break;
            }
            case "csRight3": {
                sendPhoto = crossings.crossings4(); break;
            }
            case "csRight4": {
                sendPhoto = crossings.crossings5(); break;
            }


            case "tnRight1": {
                sendPhoto = transportation.transportation2(); break;
            }
            case "tnRight2": {
                sendPhoto = transportation.transportation3(); break;
            }
            case "tnRight3": {
                sendPhoto = transportation.transportation4(); break;
            }
            case "tnRight4": {
                sendPhoto = transportation.transportation5(); break;
            }

            case "dyRight1": {
                sendPhoto = driversResponsibility.driversResponsibility2(); break;
            }
            case "dyRight2": {
                sendPhoto = driversResponsibility.driversResponsibility3(); break;
            }
            case "dyRight3": {
                sendPhoto = driversResponsibility.driversResponsibility4(); break;
            }
            case "dyRight4": {
                sendPhoto = driversResponsibility.driversResponsibility5(); break;
            }

            case "eyRight1": {
                sendPhoto = emergency.emergency2(); break;
            }
            case "eyRight2": {
                sendPhoto = emergency.emergency3(); break;
            }
            case "eyRight3": {
                sendPhoto = emergency.emergency4(); break;
            }
            case "eyRight4": {
                sendPhoto = emergency.emergency5(); break;
            }


            case "ftRight1": {
                sendPhoto = firstTicket.question2();
                break;
            }
            case "ftRight2": {
                sendPhoto = firstTicket.question3();
                break;
            }
            case "ftRight3": {
                sendPhoto = firstTicket.question4();
                break;
            }
            case "ftRight4": {
                sendPhoto = firstTicket.question5();
                break;
            }
            case "ftRight5": {
                sendPhoto = firstTicket.question6();
                break;
            }
            case "ftRight6": {
                sendPhoto = firstTicket.question7();
                break;
            }
            case "ftRight7": {
                sendPhoto = firstTicket.question8();
                break;
            }
            case "ftRight8": {
                sendPhoto = firstTicket.question9();
                break;
            }
            case "ftRight9": {
                sendPhoto = firstTicket.question10();
                break;
            }
            case "ftRight10": {
                sendPhoto = firstTicket.question11();
                break;
            }
            case "ftRight11": {
                sendPhoto = firstTicket.question12();
                break;
            }
            case "ftRight12": {
                sendPhoto = firstTicket.question13();
                break;
            }
            case "ftRight13": {
                sendPhoto = firstTicket.question14();
                break;
            }
            case "ftRight14": {
                sendPhoto = firstTicket.question15();
                break;
            }
            case "ftRight15": {
                sendPhoto = firstTicket.question16();
                break;
            }
            case "ftRight16": {
                sendPhoto = firstTicket.question17();
                break;
            }
            case "ftRight17": {
                sendPhoto = firstTicket.question18();
                break;
            }
            case "ftRight18": {
                sendPhoto = firstTicket.question19();
                break;
            }
            case "ftRight19": {
                sendPhoto = firstTicket.question20();
                break;
            }




            case "scRight1": {
                sendPhoto = secondTicket.question2();
                break;
            }
            case "scRight2": {
                sendPhoto = secondTicket.question3();
                break;
            }
            case "scRight3": {
                sendPhoto = secondTicket.question4();
                break;
            }
            case "scRight4": {
                sendPhoto = secondTicket.question5();
                break;
            }
            case "scRight5": {
                sendPhoto = secondTicket.question6();
                break;
            }
            case "scRight6": {
                sendPhoto = secondTicket.question7();
                break;
            }
            case "scRight7": {
                sendPhoto = secondTicket.question8();
                break;
            }
            case "scRight8": {
                sendPhoto = secondTicket.question9();
                break;
            }
            case "scRight9": {
                sendPhoto = secondTicket.question10();
                break;
            }
            case "scRight10": {
                sendPhoto = secondTicket.question11();
                break;
            }
            case "scRight11": {
                sendPhoto = secondTicket.question12();
                break;
            }
            case "scRight12": {
                sendPhoto = secondTicket.question13();
                break;
            }
            case "scRight13": {
                sendPhoto = secondTicket.question14();
                break;
            }
            case "scRight14": {
                sendPhoto = secondTicket.question15();
                break;
            }
            case "scRight15": {
                sendPhoto = secondTicket.question16();
                break;
            }
            case "scRight16": {
                sendPhoto = secondTicket.question17();
                break;
            }
            case "scRight17": {
                sendPhoto = secondTicket.question18();
                break;
            }
            case "scRight18": {
                sendPhoto = secondTicket.question19();
                break;
            }
            case "scRight19": {
                sendPhoto = secondTicket.question20();
                break;
            }

            case "thRight1": {
                sendPhoto = thirdTicket.question2(); break;
            }
            case "thRight2": {
                sendPhoto = thirdTicket.question3(); break;
            }
            case "thRight3": {
                sendPhoto = thirdTicket.question4(); break;
            }
            case "thRight4": {
                sendPhoto = thirdTicket.question5(); break;
            }
            case "thRight5": {
                sendPhoto = thirdTicket.question6(); break;
            }
            case "thRight6": {
                sendPhoto = thirdTicket.question7(); break;
            }
            case "thRight7": {
                sendPhoto = thirdTicket.question8(); break;
            }
            case "thRight8": {
                sendPhoto = thirdTicket.question9(); break;
            }
            case "thRight9": {
                sendPhoto = thirdTicket.question10(); break;
            }
            case "thRight10": {
                sendPhoto = thirdTicket.question11(); break;
            }
            case "thRight11": {
                sendPhoto = thirdTicket.question12(); break;
            }
            case "thRight12": {
                sendPhoto = thirdTicket.question13(); break;
            }
            case "thRight13": {
                sendPhoto = thirdTicket.question14(); break;
            }
            case "thRight14": {
                sendPhoto = thirdTicket.question15(); break;
            }
            case "thRight15": {
                sendPhoto = thirdTicket.question16(); break;
            }
            case "thRight16": {
                sendPhoto = thirdTicket.question17(); break;
            }
            case "thRight17": {
                sendPhoto = thirdTicket.question18(); break;
            }
            case "thRight18": {
                sendPhoto = thirdTicket.question19(); break;
            }
            case "thRight19": {
                sendPhoto = thirdTicket.question20(); break;
            }

            case "foRight1": {
                sendPhoto = fourthTicket.question2(); break;
            }
            case "foRight2": {
                sendPhoto = fourthTicket.question3(); break;
            }
            case "foRight3": {
                sendPhoto = fourthTicket.question4(); break;
            }
            case "foRight4": {
                sendPhoto = fourthTicket.question5(); break;
            }
            case "foRight5": {
                sendPhoto = fourthTicket.question6(); break;
            }
            case "foRight6": {
                sendPhoto = fourthTicket.question7(); break;
            }
            case "foRight7": {
                sendPhoto = fourthTicket.question8(); break;
            }
            case "foRight8": {
                sendPhoto = fourthTicket.question9(); break;
            }
            case "foRight9": {
                sendPhoto = fourthTicket.question10(); break;
            }
            case "foRight10": {
                sendPhoto = fourthTicket.question11(); break;
            }
            case "foRight11": {
                sendPhoto = fourthTicket.question12(); break;
            }
            case "foRight12": {
                sendPhoto = fourthTicket.question13(); break;
            }
            case "foRight13": {
                sendPhoto = fourthTicket.question14(); break;
            }
            case "foRight14": {
                sendPhoto = fourthTicket.question15(); break;
            }
            case "foRight15": {
                sendPhoto = fourthTicket.question16(); break;
            }
            case "foRight16": {
                sendPhoto = fourthTicket.question17(); break;
            }
            case "foRight17": {
                sendPhoto = fourthTicket.question18(); break;
            }
            case "foRight18": {
                sendPhoto = fourthTicket.question19(); break;
            }
            case "foRight19": {
                sendPhoto = fourthTicket.question20(); break;
            }

            case "fiRight1": {
                sendPhoto = fifthTicket.question2(); break;
            }
            case "fiRight2": {
                sendPhoto = fifthTicket.question3(); break;
            }
            case "fiRight3": {
                sendPhoto = fifthTicket.question4(); break;
            }
            case "fiRight4": {
                sendPhoto = fifthTicket.question5(); break;
            }
            case "fiRight5": {
                sendPhoto = fifthTicket.question6(); break;
            }
            case "fiRight6": {
                sendPhoto = fifthTicket.question7(); break;
            }
            case "fiRight7": {
                sendPhoto = fifthTicket.question8(); break;
            }
            case "fiRight8": {
                sendPhoto = fifthTicket.question9(); break;
            }
            case "fiRight9": {
                sendPhoto = fifthTicket.question10(); break;
            }
            case "fiRight10": {
                sendPhoto = fifthTicket.question11(); break;
            }
            case "fiRight11": {
                sendPhoto = fifthTicket.question12(); break;
            }
            case "fiRight12": {
                sendPhoto = fifthTicket.question13(); break;
            }
            case "fiRight13": {
                sendPhoto = fifthTicket.question14(); break;
            }
            case "fiRight14": {
                sendPhoto = fifthTicket.question15(); break;
            }
            case "fiRight15": {
                sendPhoto = fifthTicket.question16(); break;
            }
            case "fiRight16": {
                sendPhoto = fifthTicket.question17(); break;
            }
            case "fiRight17": {
                sendPhoto = fifthTicket.question18(); break;
            }
            case "fiRight18": {
                sendPhoto = fifthTicket.question19(); break;
            }
            case "fiRight19": {
                sendPhoto = fifthTicket.question20(); break;
            }
        }
        return sendPhoto;
    }
    public DeleteMessage deleteMessage() {
        DeleteMessage deleteMessage = new DeleteMessage();
        deleteMessage.setChatId(callbackQuery.getMessage().getChatId().toString());
        deleteMessage.setMessageId(callbackQuery.getMessage().getMessageId());
        return deleteMessage;
    }
    public SendMessage infoTicketMessage() {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(TICKETANSWER);
        sendMessage.setChatId(callbackQuery.getMessage().getChatId().toString());
        return sendMessage;
    }
    public SendMessage infoMessage() {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setText(ANSWER);
        sendMessage.setChatId(callbackQuery.getMessage().getChatId().toString());
        return sendMessage;
    }
}
