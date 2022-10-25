import java.util.Date;

class Clock2 {
    private int alarmHours;
    private int alarmMinutes;

    // getter for hours
    public int getHours() {
        String timeStr = new Date().toString().split(" ")[3];
        int hour = Integer.parseInt(timeStr.split(":")[0]);
        return hour;
    }

    // getter for minutes
    public int getMinutes() {
        String timeStr = new Date().toString().split(" ")[3];
        int minute = Integer.parseInt(timeStr.split(":")[1]);
        return minute;
    }

    public String getTime() {
        if (alarmHours == -1 && alarmMinutes == -1)
            return String.format("%02d:%02d", getHours(), getMinutes());
        else {
            if (getHours() >= alarmHours && getMinutes() >= alarmMinutes) {
                alarmHours = -1;
                alarmMinutes = -1;
                return String.format("%02d:%02d Alarm %c", getHours(), getMinutes(), '\u23F0');
            } else {
                return String.format("%02d:%02d", getHours(), getMinutes());
            }
        }
    }

    public void setAlarm(int hours, int minutes) {
        alarmHours = hours;
        alarmMinutes = minutes;
    }
}