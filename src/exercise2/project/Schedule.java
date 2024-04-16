package exercise2.project;

import java.time.LocalDate;
import java.time.LocalTime;

public class Schedule {
    private LocalDate today;

    //上午
    private boolean morning;//是否看诊
    private LocalDate mstart;
    private LocalDate mend;
    private int mTotalNumber;
    private int mAppointNumber;

    //下午
    private boolean afternoon;
    private LocalTime astart;
    private LocalTime aend;
    private int aTotalNumber;
    private int aAppointNumber;

    public LocalDate getToday() {
        return today;
    }

    public void setToday(LocalDate today) {
        this.today = today;
    }

    public boolean isMorning() {
        return morning;
    }

    public void setMorning(boolean morning) {
        this.morning = morning;
    }

    public LocalDate getMstart() {
        return mstart;
    }

    public void setMstart(LocalDate mstart) {
        this.mstart = mstart;
    }

    public LocalDate getMend() {
        return mend;
    }

    public void setMend(LocalDate mend) {
        this.mend = mend;
    }

    public int getmTotalNumber() {
        return mTotalNumber;
    }

    public void setmTotalNumber(int mTotalNumber) {
        this.mTotalNumber = mTotalNumber;
    }

    public int getmAppointNumber() {
        return mAppointNumber;
    }

    public void setmAppointNumber(int mAppointNumber) {
        this.mAppointNumber = mAppointNumber;
    }

    public boolean isAfternoon() {
        return afternoon;
    }

    public void setAfternoon(boolean afternoon) {
        this.afternoon = afternoon;
    }

    public LocalTime getAstart() {
        return astart;
    }

    public void setAstart(LocalTime astart) {
        this.astart = astart;
    }

    public LocalTime getAend() {
        return aend;
    }

    public void setAend(LocalTime aend) {
        this.aend = aend;
    }

    public int getaTotalNumber() {
        return aTotalNumber;
    }

    public void setaTotalNumber(int aTotalNumber) {
        this.aTotalNumber = aTotalNumber;
    }

    public int getaAppointNumber() {
        return aAppointNumber;
    }

    public void setaAppointNumber(int aAppointNumber) {
        this.aAppointNumber = aAppointNumber;
    }
}
