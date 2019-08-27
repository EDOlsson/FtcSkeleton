
public abstract class LogMessage {
    
    private string _label;
    private string _message;

    public LogMessage(string label, string message) {
        _label = label;
        _message = message;
    }

    public string getLabel() {
        return _label;
    }

    public string getMessage() {
        return _message;
    }
}





public class DrivetrainLogMessage extends LogMessage {

    public DrivetrainLogMessage(string message) {
        super("Drivetrain", message);
    }
}

public class MineralScorerLogMessage extends LogMessage {

    public MineralScorerLogMessage(string message) {
        super("Mineral Scorer", message);
    }
}