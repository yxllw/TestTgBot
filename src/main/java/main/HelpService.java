package main;

import main.tickets.*;
import main.topicTickets.*;
import org.telegram.telegrambots.meta.api.methods.updatingmessages.EditMessageCaption;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;

public class HelpService {
    CallbackQuery callbackQuery;
    EditMessageCaption editMessageCaption = new EditMessageCaption();
    public HelpService(CallbackQuery callbackQuery) {
        this.callbackQuery = callbackQuery;
    }
    public EditMessageCaption helpCaption() {
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
        String data = callbackQuery.getData();
        switch (data) {
            case "gpHelp1": {
                editMessageCaption = generalProvisions.editMessageCaptionHelp1();
                break;
            }
            case "gpHelp2": {
                editMessageCaption = generalProvisions.editMessageCaptionHelp2();
                break;
            }
            case "gpHelp3": {
                editMessageCaption = generalProvisions.editMessageCaptionHelp3();
                break;
            }
            case "gpHelp4": {
                editMessageCaption = generalProvisions.editMessageCaptionHelp4();
                break;
            }
            case "gpHelp5": {
                editMessageCaption = generalProvisions.editMessageCaptionHelp5();
                break;
            }


            case "rmHelp1": {
                editMessageCaption = roadMarks.editMessageCaptionHelp1();
                break;
            }
            case "rmHelp2": {
                editMessageCaption = roadMarks.editMessageCaptionHelp2();
                break;
            }
            case "rmHelp3": {
                editMessageCaption = roadMarks.editMessageCaptionHelp3();
                break;
            }
            case "rmHelp4": {
                editMessageCaption = roadMarks.editMessageCaptionHelp4();
                break;
            }
            case "rmHelp5": {
                editMessageCaption = roadMarks.editMessageCaptionHelp5();
                break;
            }

            case "rsHelp1": {
                editMessageCaption = roadSigns.editMessageCaptionHelp1(); break;
            }
            case "rsHelp2": {
                editMessageCaption = roadSigns.editMessageCaptionHelp2(); break;
            }
            case "rsHelp3": {
                editMessageCaption = roadSigns.editMessageCaptionHelp3(); break;
            }
            case "rsHelp4": {
                editMessageCaption = roadSigns.editMessageCaptionHelp4(); break;
            }
            case "rsHelp5": {
                editMessageCaption = roadSigns.editMessageCaptionHelp5(); break;
            }

            case "tsHelp1": {
                editMessageCaption = trafficSignals.editMessageCaptionHelp1(); break;
            }
            case "tsHelp2": {
                editMessageCaption = trafficSignals.editMessageCaptionHelp2(); break;
            }
            case "tsHelp3": {
                editMessageCaption = trafficSignals.editMessageCaptionHelp3(); break;
            }
            case "tsHelp4": {
                editMessageCaption = trafficSignals.editMessageCaptionHelp4(); break;
            }
            case "tsHelp5": {
                editMessageCaption = trafficSignals.editMessageCaptionHelp5(); break;
            }

            case "drHelp1": {
                editMessageCaption = drive.editMessageCaptionHelp1(); break;
            }
            case "drHelp2": {
                editMessageCaption = drive.editMessageCaptionHelp2(); break;
            }
            case "drHelp3": {
                editMessageCaption = drive.editMessageCaptionHelp3(); break;
            }
            case "drHelp4": {
                editMessageCaption = drive.editMessageCaptionHelp4(); break;
            }
            case "drHelp5": {
                editMessageCaption = drive.editMessageCaptionHelp5(); break;
            }

            case "spHelp1": {
                editMessageCaption = speed.editMessageCaptionHelp1(); break;
            }
            case "spHelp2": {
                editMessageCaption = speed.editMessageCaptionHelp2(); break;
            }
            case "spHelp3": {
                editMessageCaption = speed.editMessageCaptionHelp3(); break;
            }
            case "spHelp4": {
                editMessageCaption = speed.editMessageCaptionHelp4(); break;
            }
            case "spHelp5": {
                editMessageCaption = speed.editMessageCaptionHelp5(); break;
            }

            case "ogHelp1": {
                editMessageCaption = overtaking.editMessageCaptionHelp1(); break;
            }
            case "ogHelp2": {
                editMessageCaption = overtaking.editMessageCaptionHelp2(); break;
            }
            case "ogHelp3": {
                editMessageCaption = overtaking.editMessageCaptionHelp3(); break;
            }
            case "ogHelp4": {
                editMessageCaption = overtaking.editMessageCaptionHelp4(); break;
            }
            case "ogHelp5": {
                editMessageCaption = overtaking.editMessageCaptionHelp5(); break;
            }

            case "pgHelp1": {
                editMessageCaption = parking.editMessageCaptionHelp1(); break;
            }
            case "pgHelp2": {
                editMessageCaption = parking.editMessageCaptionHelp2(); break;
            }
            case "pgHelp3": {
                editMessageCaption = parking.editMessageCaptionHelp3(); break;
            }
            case "pgHelp4": {
                editMessageCaption = parking.editMessageCaptionHelp4(); break;
            }
            case "pgHelp5": {
                editMessageCaption = parking.editMessageCaptionHelp5(); break;
            }

            case "cdHelp1": {
                editMessageCaption = crossroad.editMessageCaptionHelp1(); break;
            }
            case "cdHelp2": {
                editMessageCaption = crossroad.editMessageCaptionHelp2(); break;
            }
            case "cdHelp3": {
                editMessageCaption = crossroad.editMessageCaptionHelp3(); break;
            }
            case "cdHelp4": {
                editMessageCaption = crossroad.editMessageCaptionHelp4(); break;
            }
            case "cdHelp5": {
                editMessageCaption = crossroad.editMessageCaptionHelp5(); break;
            }


            case "lhHelp1": {
                editMessageCaption = lightsHorn.editMessageCaptionHelp1(); break;
            }
            case "lhHelp2": {
                editMessageCaption = lightsHorn.editMessageCaptionHelp2(); break;
            }
            case "lhHelp3": {
                editMessageCaption = lightsHorn.editMessageCaptionHelp3(); break;
            }
            case "lhHelp4": {
                editMessageCaption = lightsHorn.editMessageCaptionHelp4(); break;
            }
            case "lhHelp5": {
                editMessageCaption = lightsHorn.editMessageCaptionHelp5(); break;
            }


            case "meHelp1": {
                editMessageCaption = maintenance.editMessageCaptionHelp1(); break;
            }
            case "meHelp2": {
                editMessageCaption = maintenance.editMessageCaptionHelp2(); break;
            }
            case "meHelp3": {
                editMessageCaption = maintenance.editMessageCaptionHelp3(); break;
            }
            case "meHelp4": {
                editMessageCaption = maintenance.editMessageCaptionHelp4(); break;
            }
            case "meHelp5": {
                editMessageCaption = maintenance.editMessageCaptionHelp5(); break;
            }

            case "sdHelp1": {
                editMessageCaption = safeDrive.editMessageCaptionHelp1(); break;
            }
            case "sdHelp2": {
                editMessageCaption = safeDrive.editMessageCaptionHelp2(); break;
            }
            case "sdHelp3": {
                editMessageCaption = safeDrive.editMessageCaptionHelp3(); break;
            }
            case "sdHelp4": {
                editMessageCaption = safeDrive.editMessageCaptionHelp4(); break;
            }
            case "sdHelp5": {
                editMessageCaption = safeDrive.editMessageCaptionHelp5(); break;
            }

            case "faHelp1": {
                editMessageCaption = firstAid.editMessageCaptionHelp1(); break;
            }
            case "faHelp2": {
                editMessageCaption = firstAid.editMessageCaptionHelp2(); break;
            }
            case "faHelp3": {
                editMessageCaption = firstAid.editMessageCaptionHelp3(); break;
            }
            case "faHelp4": {
                editMessageCaption = firstAid.editMessageCaptionHelp4(); break;
            }
            case "faHelp5": {
                editMessageCaption = firstAid.editMessageCaptionHelp5(); break;
            }

            case "ryHelp1": {
                editMessageCaption = responsibility.editMessageCaptionHelp1(); break;
            }
            case "ryHelp2": {
                editMessageCaption = responsibility.editMessageCaptionHelp2(); break;
            }
            case "ryHelp3": {
                editMessageCaption = responsibility.editMessageCaptionHelp3(); break;
            }
            case "ryHelp4": {
                editMessageCaption = responsibility.editMessageCaptionHelp4(); break;
            }
            case "ryHelp5": {
                editMessageCaption = responsibility.editMessageCaptionHelp5(); break;
            }


            case "doHelp1": {
                editMessageCaption = driveOrder.editMessageCaptionHelp1(); break;
            }
            case "doHelp2": {
                editMessageCaption = driveOrder.editMessageCaptionHelp2(); break;
            }
            case "doHelp3": {
                editMessageCaption = driveOrder.editMessageCaptionHelp3(); break;
            }
            case "doHelp4": {
                editMessageCaption = driveOrder.editMessageCaptionHelp4(); break;
            }
            case "doHelp5": {
                editMessageCaption = driveOrder.editMessageCaptionHelp5(); break;
            }

            case "busHelp1": {
                editMessageCaption = bus.editMessageCaptionHelp1(); break;
            }
            case "busHelp2": {
                editMessageCaption = bus.editMessageCaptionHelp2(); break;
            }
            case "busHelp3": {
                editMessageCaption = bus.editMessageCaptionHelp3(); break;
            }
            case "busHelp4": {
                editMessageCaption = bus.editMessageCaptionHelp4(); break;
            }
            case "busHelp5": {
                editMessageCaption = bus.editMessageCaptionHelp5(); break;
            }

            case "towHelp1": {
                editMessageCaption = tow.editMessageCaptionHelp1(); break;
            }
            case "towHelp2": {
                editMessageCaption = tow.editMessageCaptionHelp2(); break;
            }
            case "towHelp3": {
                editMessageCaption = tow.editMessageCaptionHelp3(); break;
            }
            case "towHelp4": {
                editMessageCaption = tow.editMessageCaptionHelp4(); break;
            }
            case "towHelp5": {
                editMessageCaption = tow.editMessageCaptionHelp5(); break;
            }

            case "ssHelp1": {
                editMessageCaption = specialSignals.editMessageCaptionHelp1(); break;
            }
            case "ssHelp2": {
                editMessageCaption = specialSignals.editMessageCaptionHelp2(); break;
            }
            case "ssHelp3": {
                editMessageCaption = specialSignals.editMessageCaptionHelp3(); break;
            }
            case "ssHelp4": {
                editMessageCaption = specialSignals.editMessageCaptionHelp4(); break;
            }
            case "ssHelp5": {
                editMessageCaption = specialSignals.editMessageCaptionHelp5(); break;
            }

            case "hwHelp1": {
                editMessageCaption = highway.editMessageCaptionHelp1(); break;
            }
            case "hwHelp2": {
                editMessageCaption = highway.editMessageCaptionHelp2(); break;
            }
            case "hwHelp3": {
                editMessageCaption = highway.editMessageCaptionHelp3(); break;
            }
            case "hwHelp4": {
                editMessageCaption = highway.editMessageCaptionHelp4(); break;
            }
            case "hwHelp5": {
                editMessageCaption = highway.editMessageCaptionHelp5(); break;
            }

            case "tbHelp1": {
                editMessageCaption = trainingBicycle.editMessageCaptionHelp1(); break;
            }
            case "tbHelp2": {
                editMessageCaption = trainingBicycle.editMessageCaptionHelp2(); break;
            }
            case "tbHelp3": {
                editMessageCaption = trainingBicycle.editMessageCaptionHelp3(); break;
            }
            case "tbHelp4": {
                editMessageCaption = trainingBicycle.editMessageCaptionHelp4(); break;
            }


            case "raHelp1": {
                editMessageCaption = residentialArea.editMessageCaptionHelp1(); break;
            }
            case "raHelp2": {
                editMessageCaption = residentialArea.editMessageCaptionHelp2(); break;
            }
            case "raHelp3": {
                editMessageCaption = residentialArea.editMessageCaptionHelp3(); break;
            }
            case "raHelp4": {
                editMessageCaption = residentialArea.editMessageCaptionHelp4(); break;
            }
            case "raHelp5": {
                editMessageCaption = residentialArea.editMessageCaptionHelp5(); break;
            }

            case "rwHelp1": {
                editMessageCaption = railway.editMessageCaptionHelp1(); break;
            }
            case "rwHelp2": {
                editMessageCaption = railway.editMessageCaptionHelp2(); break;
            }
            case "rwHelp3": {
                editMessageCaption = railway.editMessageCaptionHelp3(); break;
            }
            case "rwHelp4": {
                editMessageCaption = railway.editMessageCaptionHelp4(); break;
            }
            case "rwHelp5": {
                editMessageCaption = railway.editMessageCaptionHelp5(); break;
            }

            case "csHelp1": {
                editMessageCaption = crossings.editMessageCaptionHelp1(); break;
            }
            case "csHelp2": {
                editMessageCaption = crossings.editMessageCaptionHelp2(); break;
            }
            case "csHelp3": {
                editMessageCaption = crossings.editMessageCaptionHelp3(); break;
            }
            case "csHelp4": {
                editMessageCaption = crossings.editMessageCaptionHelp4(); break;
            }
            case "csHelp5": {
                editMessageCaption = crossings.editMessageCaptionHelp5(); break;
            }

            case "tnHelp1": {
                editMessageCaption = transportation.editMessageCaptionHelp1(); break;
            }
            case "tnHelp2": {
                editMessageCaption = transportation.editMessageCaptionHelp2(); break;
            }
            case "tnHelp3": {
                editMessageCaption = transportation.editMessageCaptionHelp3(); break;
            }
            case "tnHelp4": {
                editMessageCaption = transportation.editMessageCaptionHelp4(); break;
            }
            case "tnHelp5": {
                editMessageCaption = transportation.editMessageCaptionHelp5(); break;
            }

            case "dyHelp1": {
                editMessageCaption = driversResponsibility.editMessageCaptionHelp1(); break;
            }
            case "dyHelp2": {
                editMessageCaption = driversResponsibility.editMessageCaptionHelp2(); break;
            }
            case "dyHelp3": {
                editMessageCaption = driversResponsibility.editMessageCaptionHelp3(); break;
            }
            case "dyHelp4": {
                editMessageCaption = driversResponsibility.editMessageCaptionHelp4(); break;
            }
            case "dyHelp5": {
                editMessageCaption = driversResponsibility.editMessageCaptionHelp5(); break;
            }

            case "eyHelp1": {
                editMessageCaption = emergency.editMessageCaptionHelp1(); break;
            }
            case "eyHelp2": {
                editMessageCaption = emergency.editMessageCaptionHelp2(); break;
            }
            case "eyHelp3": {
                editMessageCaption = emergency.editMessageCaptionHelp3(); break;
            }
            case "eyHelp4": {
                editMessageCaption = emergency.editMessageCaptionHelp4(); break;
            }
            case "eyHelp5": {
                editMessageCaption = emergency.editMessageCaptionHelp5(); break;
            }


            case "ftHelp1": {
                editMessageCaption = firstTicket.editMessageCaptionHelp1();
                break;
            }
            case "ftHelp2": {
                editMessageCaption = firstTicket.editMessageCaptionHelp2();
                break;
            }
            case "ftHelp3": {
                editMessageCaption = firstTicket.editMessageCaptionHelp3();
                break;
            }
            case "ftHelp4": {
                editMessageCaption = firstTicket.editMessageCaptionHelp4();
                break;
            }
            case "ftHelp5": {
                editMessageCaption = firstTicket.editMessageCaptionHelp5();
                break;
            }
            case "ftHelp6": {
                editMessageCaption = firstTicket.editMessageCaptionHelp6();
                break;
            }
            case "ftHelp7": {
                editMessageCaption = firstTicket.editMessageCaptionHelp7();
                break;
            }
            case "ftHelp8": {
                editMessageCaption = firstTicket.editMessageCaptionHelp8();
                break;
            }
            case "ftHelp9": {
                editMessageCaption = firstTicket.editMessageCaptionHelp9();
                break;
            }
            case "ftHelp10": {
                editMessageCaption = firstTicket.editMessageCaptionHelp10();
                break;
            }
            case "ftHelp11": {
                editMessageCaption = firstTicket.editMessageCaptionHelp11();
                break;
            }
            case "ftHelp12": {
                editMessageCaption = firstTicket.editMessageCaptionHelp12();
                break;
            }
            case "ftHelp13": {
                editMessageCaption = firstTicket.editMessageCaptionHelp13();
                break;
            }
            case "ftHelp14": {
                editMessageCaption = firstTicket.editMessageCaptionHelp14();
                break;
            }
            case "ftHelp15": {
                editMessageCaption = firstTicket.editMessageCaptionHelp15();
                break;
            }
            case "ftHelp16": {
                editMessageCaption = firstTicket.editMessageCaptionHelp16();
                break;
            }
            case "ftHelp17": {
                editMessageCaption = firstTicket.editMessageCaptionHelp17();
                break;
            }
            case "ftHelp18": {
                editMessageCaption = firstTicket.editMessageCaptionHelp18();
                break;
            }
            case "ftHelp19": {
                editMessageCaption = firstTicket.editMessageCaptionHelp19();
                break;
            }
            case "ftHelp20": {
                editMessageCaption = firstTicket.editMessageCaptionHelp20();
                break;
            }


            case "scHelp1": {
                editMessageCaption = secondTicket.editMessageCaptionHelp1();
                break;
            }
            case "scHelp2": {
                editMessageCaption = secondTicket.editMessageCaptionHelp2();
                break;
            }
            case "scHelp3": {
                editMessageCaption = secondTicket.editMessageCaptionHelp3();
                break;
            }
            case "scHelp4": {
                editMessageCaption = secondTicket.editMessageCaptionHelp4();
                break;
            }
            case "scHelp5": {
                editMessageCaption = secondTicket.editMessageCaptionHelp5();
                break;
            }
            case "scHelp6": {
                editMessageCaption = secondTicket.editMessageCaptionHelp6();
                break;
            }
            case "scHelp7": {
                editMessageCaption = secondTicket.editMessageCaptionHelp7();
                break;
            }
            case "scHelp8": {
                editMessageCaption = secondTicket.editMessageCaptionHelp8();
                break;
            }
            case "scHelp9": {
                editMessageCaption = secondTicket.editMessageCaptionHelp9();
                break;
            }
            case "scHelp10": {
                editMessageCaption = secondTicket.editMessageCaptionHelp10();
                break;
            }
            case "scHelp11": {
                editMessageCaption = secondTicket.editMessageCaptionHelp11();
                break;
            }
            case "scHelp12": {
                editMessageCaption = secondTicket.editMessageCaptionHelp12();
                break;
            }
            case "scHelp13": {
                editMessageCaption = secondTicket.editMessageCaptionHelp13();
                break;
            }
            case "scHelp14": {
                editMessageCaption = secondTicket.editMessageCaptionHelp14();
                break;
            }
            case "scHelp15": {
                editMessageCaption = secondTicket.editMessageCaptionHelp15();
                break;
            }
            case "scHelp16": {
                editMessageCaption = secondTicket.editMessageCaptionHelp16();
                break;
            }
            case "scHelp17": {
                editMessageCaption = secondTicket.editMessageCaptionHelp17();
                break;
            }
            case "scHelp18": {
                editMessageCaption = secondTicket.editMessageCaptionHelp18();
                break;
            }
            case "scHelp19": {
                editMessageCaption = secondTicket.editMessageCaptionHelp19();
                break;
            }
            case "scHelp20": {
                editMessageCaption = secondTicket.editMessageCaptionHelp20();
                break;
            }




            case "thHelp1": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp1();
                break;
            }
            case "thHelp2": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp2();
                break;
            }
            case "thHelp3": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp3();
                break;
            }
            case "thHelp4": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp4();
                break;
            }
            case "thHelp5": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp5();
                break;
            }
            case "thHelp6": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp6();
                break;
            }
            case "thHelp7": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp7();
                break;
            }
            case "thHelp8": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp8();
                break;
            }
            case "thHelp9": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp9();
                break;
            }
            case "thHelp10": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp10();
                break;
            }
            case "thHelp11": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp11();
                break;
            }
            case "thHelp12": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp12();
                break;
            }
            case "thHelp13": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp13();
                break;
            }
            case "thHelp14": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp14();
                break;
            }
            case "thHelp15": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp15();
                break;
            }
            case "thHelp16": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp16();
                break;
            }
            case "thHelp17": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp17();
                break;
            }
            case "thHelp18": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp18();
                break;
            }
            case "thHelp19": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp19();
                break;
            }
            case "thHelp20": {
                editMessageCaption = thirdTicket.editMessageCaptionHelp20();
                break;
            }

            case "foHelp1": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp1(); break;
            }
            case "foHelp2": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp2(); break;
            }
            case "foHelp3": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp3(); break;
            }
            case "foHelp4": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp4(); break;
            }
            case "foHelp5": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp5(); break;
            }
            case "foHelp6": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp6(); break;
            }
            case "foHelp7": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp7(); break;
            }
            case "foHelp8": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp8(); break;
            }
            case "foHelp9": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp9(); break;
            }
            case "foHelp10": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp10(); break;
            }
            case "foHelp11": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp11(); break;
            }
            case "foHelp12": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp12(); break;
            }
            case "foHelp13": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp13(); break;
            }
            case "foHelp14": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp14(); break;
            }
            case "foHelp15": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp15(); break;
            }
            case "foHelp16": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp16(); break;
            }
            case "foHelp17": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp17(); break;
            }
            case "foHelp18": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp18(); break;
            }
            case "foHelp19": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp19(); break;
            }
            case "foHelp20": {
                editMessageCaption = fourthTicket.editMessageCaptionHelp20(); break;
            }

            case "fiHelp1": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp1(); break;
            }
            case "fiHelp2": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp2(); break;
            }
            case "fiHelp3": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp3(); break;
            }
            case "fiHelp4": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp4(); break;
            }
            case "fiHelp5": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp5(); break;
            }
            case "fiHelp6": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp6(); break;
            }
            case "fiHelp7": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp7(); break;
            }
            case "fiHelp8": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp8(); break;
            }
            case "fiHelp9": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp9(); break;
            }
            case "fiHelp10": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp10(); break;
            }
            case "fiHelp11": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp11(); break;
            }
            case "fiHelp12": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp12(); break;
            }
            case "fiHelp13": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp13(); break;
            }
            case "fiHelp14": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp14(); break;
            }
            case "fiHelp15": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp15(); break;
            }
            case "fiHelp16": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp16(); break;
            }
            case "fiHelp17": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp17(); break;
            }
            case "fiHelp18": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp18(); break;
            }
            case "fiHelp19": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp19(); break;
            }
            case "fiHelp20": {
                editMessageCaption = fifthTicket.editMessageCaptionHelp20(); break;
            }
        }
        return editMessageCaption;
    }
}
