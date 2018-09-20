


import com.wl.Devel;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<Devel> loaders = ServiceLoader.load(Devel.class);
        for (Devel developer : loaders) {
            System.out.println(developer.getHHH());
        }
    }
}
