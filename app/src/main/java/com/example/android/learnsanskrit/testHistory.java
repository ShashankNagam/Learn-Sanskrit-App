package com.example.android.learnsanskrit;

public class testHistory {
     String Time;
     String Score;
     String Status;

    public testHistory() {
    }

    /*
    @Override
    public String toString() {
        return "testHistory{" +
                "Time='" + Time + '\'' +
                ", Score='" + Score + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }
     */

    public testHistory(String time, String score, String status) {
        this.Time = time;
        this.Score = score;
        this.Status = status;
    }


    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }


    /*
    public Object getTime() {
        return Time;
    }

    public void setOptionA(Object Time) {
        this.Time = (String) Time;
    }

     */

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

}
