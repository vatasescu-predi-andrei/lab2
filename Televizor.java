/**
 * This program computes a Television Set (TV) which models such a TV.
 */
public class Televizor {
    private boolean toggle=false;
    private int channelNumber=0;
    private int volumeLevel=0;
    private static int serialNumber=999;
    private int serial;
    private String powerState;
    private int channelLimit=10;

    /**
     * This is the first constructer that automatically sets the channel limit to 10
     */
    public Televizor(){
        serial=generateSerialNumber();
        serial=serialNumber;
        toggle=false;
    }

    /**
     * This constructor is taking channel Limit value and throws error if it does not fulfill the condition
     * @param channelLimit
     */
    public Televizor(int channelLimit){
        toggle=false;

        if(channelLimit>=1 && channelLimit<999){
            serial=generateSerialNumber();
            serial=serialNumber;
        }
        else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * This method generates the serial Number which is declared 999 at first and then incremented
     * @return serial Number of each TV
     */
        public int generateSerialNumber(){
        serialNumber++;
        return serialNumber;
    }

    /**
     * This method gives me the Serial Number
     * @return serial which is not static :)
     */
        public int getSerialNumber(){
        return serial;
        }

    /**
     * This method sets the channel
     * @param channel
     */
    public void setChannel(int channel)
    {
        channelNumber = channel;
    }

    /**
     * This method gives the current channel
     * @return channelNumber
     */
    public int getChannel() {
        return channelNumber;
    }

    /**
     * This method increments the Channel by one
     */
    public void incrementChannel(){
        channelNumber += 1;
    }

    /**
     * This method decrements the Channel by one
     */
    public void decrementChannel (){
        channelNumber -= 1;
    }

    /**
     * This method gives the current volume level
     * @return the volume level
     */
    public int getVolumeLevel () {
        return volumeLevel;
    }

    /**
     * This method increments the volume by 2%
     */
    public void incrementVolume () {
        if (toggle==true) {
            volumeLevel += 2;
            if (volumeLevel > 100) {
                volumeLevel = 100;
            }
        }
        else{
            System.out.println("Your tv is not on");
        }
    }

    /**
     * This method decrements the volume by 2% and not allowing it to go below 0
     */
    public void decrementVolume (){
        volumeLevel -= 2;
        if (volumeLevel < 0) {
            volumeLevel = 0;
        }
        else if(volumeLevel>100){
            volumeLevel=100;
        }
    }

    /**
     * This method toggles the power state of each TV
     */
    public void changeToggle(){;
        if(toggle==false)
        {
        powerState = "off";
        toggle=true;
        }
        else{
            powerState="on";
            toggle=false;
        }
    }

}
