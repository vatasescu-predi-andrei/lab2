public class main {
    public static void main(String args[]) {

        Televizor tv1=new Televizor();
        tv1.changeToggle();
        tv1.changeToggle();
        tv1.incrementVolume();
        tv1.getChannel();
        tv1.incrementChannel();
        System.out.println(tv1.getVolumeLevel());
//2.3
       /* Televizor[] televizors = new Televizor[5];
        televizors[0] = new Televizor();
        televizors[1] = new Televizor();
        televizors[2] = new Televizor();
        televizors[3] = new Televizor();
        televizors[4] = televizors[2];
        televizors[0].setChannel(1);
        televizors[1].setChannel(1);
        televizors[2].setChannel(1);
        televizors[3].setChannel(1);
        televizors[4].setChannel(1);

        televizors[2].incrementChannel();
        System.out.println(televizors[4].getChannel());

        System.out.println(televizors[0].getSerialNumber());
        System.out.println(televizors[1].getSerialNumber());
        System.out.println(televizors[2].getSerialNumber());
//2.4
        //televizors[4]=null;
        //televizors[4].changeToggle();

//2.5
        televizors[4]=new Televizor(0);
    }
    */
    }
}
