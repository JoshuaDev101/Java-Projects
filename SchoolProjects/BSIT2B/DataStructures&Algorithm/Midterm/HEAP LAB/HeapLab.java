
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HeapLab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of incidents: ");
        int n = scan.nextInt();
        scan.nextLine();

        int[] ids = new int[n];
        String[] locations = new String[n];
        int[] severities = new int[n];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            ids[i] = 101 + i;
            System.out.print(ids[i] + "-  Enter location: ");
            locations[i] = scan.nextLine();
            System.out.println("Enter severity score(1-10): ");
            severities[i] = scan.nextInt();
            scan.nextLine();

            maxHeap.add(severities[i]);
            minHeap.add(severities[i]);

        }
        System.out.println("Done");


        System.out.println("Dispatch Order (Max-Heap)");
        while (!maxHeap.isEmpty()) {
            int sev = maxHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == sev) {
                    System.out.println(locations[i] + " (Severity: " + sev+")");
                    break;
                }
            }

        }
        System.out.println("Backlog Monitoring (Min-Heap)");

        while (!minHeap.isEmpty()) {
            int ves = minHeap.poll();
            for (int i = 0; i < n; i++) {
                if (severities[i] == ves) {
                    System.out.println(locations[i] + " (Severity: " + ves +")");
                    break;
                }
            }

        }

    }
}
