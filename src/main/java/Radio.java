public class Radio {

    private int currentStation;
    private int currentVolume;
    private int numberStation;ii\

    public Radio() {
        this.numberStation = 9;
    }

    public Radio(int stationCount) {
        this.numberStation = stationCount - 1;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > numberStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void setToMaxStation() {

        currentStation = numberStation;
    }

    public void next() {
        if (currentStation != numberStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
        } else {
            currentStation = numberStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setToMinVolume() {
        currentVolume = 0;
    }

    public void setToMaxVolume() {
        currentVolume = 100;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}



