import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SystemTrain program = new SystemTrain();

        Plackart A = new Plackart("a-1", "Plackart", "40");

        Plackart B = new Plackart("a-2", "Plackart", "40");

        Plackart C = new Plackart("a-3", "Plackart", "40");

        Plackart D = new Plackart("a-4", "Plackart", "40");

        Plackart E = new Plackart("a-5", "Plackart", "40");

        Plackart F = new Plackart("a-6", "Plackart", "40");

        program.getPlackarts().add(A);

        program.getPlackarts().add(B);

        program.getPlackarts().add(C);

        program.getPlackarts().add(D);

        program.getPlackarts().add(E);

        program.getPlackarts().add(F);

        Locomotive G = new Locomotive("120 km/h", "40 wagons", "l-1",
                "Astana-Almaty", "48 hours" );

        Locomotive H = new Locomotive("100 km/h", "26 wagons", "l-2",
                "Almaty-Astana", "50 hours" );

        Locomotive I = new Locomotive("150 km/h", "32 wagons", "l-3",
                "Astana-Karaganda", "4 hours" );

        Locomotive J = new Locomotive("60 km/h", "10 wagons", "l-4",
                "Karaganda-Almaty", "48 hours" );

        Locomotive K = new Locomotive("90 km/h", "45 wagons", "l-5",
                "Pavlodar-Almaty", "78 hours" );

        Locomotive L = new Locomotive("115 km/h", "49 wagons", "l-6",
                "Astana-Kostanay", "3 hours" );


        program.getLocomotives().add(G);

        program.getLocomotives().add(H);

        program.getLocomotives().add(I);

        program.getLocomotives().add(J);

        program.getLocomotives().add(K);

        program.getLocomotives().add(L);


        Luxury M = new Luxury("b-1", "Luxury", "20");

        Luxury N = new Luxury("b-2", "Luxury", "20");

        Luxury O = new Luxury("b-3", "Luxury", "20");

        Luxury P = new Luxury("b-4", "Luxury", "20");

        Luxury Q = new Luxury("b-5", "Luxury", "20");

        Luxury R = new Luxury("b-6", "Luxury", "20");

        program.getLuxuries().add(M);

        program.getLuxuries().add(N);

        program.getLuxuries().add(O);

        program.getLuxuries().add(P);

        program.getLuxuries().add(Q);

        program.getLuxuries().add(R);


        Freight S = new Freight("f-1", "Freight", "80");

        Freight T = new Freight("f-2", "Freight", "80");

        Freight U = new Freight("f-3", "Freight", "80");

        Freight V = new Freight("f-4", "Freight", "80");

        Freight W = new Freight("f-5", "Freight", "80");

        Freight X = new Freight("f-6", "Freight", "80");

        program.getFreights().add(S);

        program.getFreights().add(T);

        program.getFreights().add(U);

        program.getFreights().add(V);

        program.getFreights().add(W);

        program.getFreights().add(X);


        program.Begin();
    }
}