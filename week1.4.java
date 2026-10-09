public class WarehouseBalancer {
    public static void analyzeInventory(int[] sectionA, int[] sectionB) {
        int totalA = 0;
        int totalB = 0;
        int highestQty = Integer.MIN_VALUE;
        String sectionName = "";
        int itemIndex = -1;

        for (int i = 0; i < sectionA.length; i++) {
            totalA += sectionA[i];
            if (sectionA[i] > highestQty) {
                highestQty = sectionA[i];
                sectionName = "Section A";
                itemIndex = i + 1; // 1-based index
            }
        }

        for (int i = 0; i < sectionB.length; i++) {
            totalB += sectionB[i];
            if (sectionB[i] > highestQty) {
                highestQty = sectionB[i];
                sectionName = "Section B";
                itemIndex = i + 1; // 1-based index
            }
        }

        String status = (totalA == totalB) ? "Balanced" : "Not Balanced";

        System.out.printf("Section A Total: %d | Section B Total: %d | Status: %s | Highest Quantity: %d (%s, Item %d)\n",
                totalA, totalB, status, highestQty, sectionName, itemIndex);
    }
}
