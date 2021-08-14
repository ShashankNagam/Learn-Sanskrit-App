package com.example.android.learnsanskrit;

public class testHistory {
     String Time;
     String Score;
     String Status;

    public testHistory() {
    }

    @Override
    public String toString() {
        return "testHistory{" +
                "Time='" + Time + '\'' +
                ", Score='" + Score + '\'' +
                ", Status='" + Status + '\'' +
                '}';
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

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
