

public class DriveTrain extends Subsystem {

    private HardwareMap _hardwareMap;

    private DcMotor _leftDrive;
    private DcMotor _rightDrive;

    private bool _isDrivingForward = false;
    private bool _isStopped = true;

    public DriveTrain(HardwareMap hardwareMap) {
        _hardwareMap = hardwareMap;
    }

    @Override
    public void init() {
        _leftDrive = _hardwareMap.dcMotor.get("leftDrive");
        _rightDrive = _hardwareMap.dcMotor.get("rightDrive");

        _leftDrive.setPower(0);
        _rightDrive.setPower(0);

        _isStopped = true;
    }

    @Override
    public void setInput(Gamepad gamepad) {
        // get from gamepad what input we need...

        if(gamepad.left_stick_y < 0) {
            _isStopped = false;
            _isDrivingForward = true;
        } else {
            _isDrivingForward = false;
            _isStopped = true;
        }
    }

    @Override
    public void execute() {

        if(_isDrivingForward) {
            _leftDrive.setPower(1);
            _rightDrive.setPower(1);
        }
        else if(_isStopped) {
            _leftDrive.setPower(0);
            _rightDrive.setPower(0);
        }
    }

    @Override
    public LogMessage getLogMessage() {
        return new DriveTrainLogMessage("I'm the drive train");
    }
}

public class MineralScorer extends Subsystem {

    // ... fill out class

}

public class MineralLifter extends Subsystem {

    // fill out class
}

public class HangingMechanism extends Subsystem {

    // fill out class

}