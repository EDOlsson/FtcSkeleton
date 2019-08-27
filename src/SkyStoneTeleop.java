
import com.qualcomm.robotcore.eventloop.opmode.Teleop;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import Subsystem;

@Teleop(name="SkyStone base Teleop")
@Disabled
public class SkyStoneTeleop extends OpMode {

    private static final int _numberOfSubsystems = 4;

    private Subsystem[] _robotSubsystems = new Subsystem[_numberOfSubsystems];

    @Override
    public void init() {

        // initialize hardware from hardwareMap
        // initialize motors to correct RunMode
        // set robot to correct starting state

        _robotSubsystems[0] = new DriveTrain(hardwareMap);

        for(Subsystem subsystem : _robotSubsystems) {
            subsystem.init();
        }

    }

    @Override
    public void loop() {

        readControllerInput();
        readAllSensorValues();
        calculateRobotState();
        setRobotState();

        for(Subsystem subsystem : _robotSubsystems) {
            subsystem.sendInput(gamepad1);
            subsystem.execute();

            logMessages.add(subsystem.getMessage());
        }

        telemetry.addDate("loop", "finished iteration");
        telemetry.update();
    }

    private void readControllerInput() {

    }

    private void readAllSensorValues() {

    }

    private void calculateRobotState() {

    }

    private void setRobotState() {

    }
}