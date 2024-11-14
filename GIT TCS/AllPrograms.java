import java.util.*;

public class AllPrograms {

    // Program 1: Rearrange Array in Increasing-Decreasing Order
    public static void rearrangeArray(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int[] result = new int[n];
        int j = 0;
        for (int i = 0; i < n / 2; i++)
            result[j++] = arr[i];
        for (int i = n - 1; i >= n / 2; i--)
            result[j++] = arr[i];
        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }

    // Program 2: Find the Second Smallest and Second Largest Element
    public static void findSecondSmallestLargest(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Second Smallest: " + arr[1] + ", Second Largest: " + arr[arr.length - 2]);
    }

    // Program 3: Sort Elements by Frequency
    public static void sortByFrequency(int[] arr) {
        Map<Integer, Integer> freqMap = new LinkedHashMap<>();
        for (int num : arr)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        arr = freqMap.entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().equals(e1.getValue()) ? Integer.compare(e1.getKey(), e2.getKey())
                        : Integer.compare(e2.getValue(), e1.getValue()))
                .flatMap(e -> Collections.nCopies(e.getValue(), e.getKey()).stream())
                .mapToInt(Integer::intValue).toArray();
        System.out.println("Array sorted by frequency: " + Arrays.toString(arr));
    }

    // Program 4: Rotate Array by K Elements
    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;
        int[] rotated = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rotated[(i + k) % arr.length] = arr[i];
        }
        System.out.println("Rotated Array: " + Arrays.toString(rotated));
    }

    // Program 5: Remove Duplicates from an Unsorted Array
    public static void removeDuplicates(int[] arr) {
        Set<Integer> uniqueElements = new HashSet<>();
        for (int num : arr)
            uniqueElements.add(num);
        System.out.println("Array without duplicates: " + uniqueElements);
    }

    // Program 6: Check if Array is Subset of Another Array
    public static void isSubset(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        for (int num : arr1)
            set1.add(num);
        boolean isSubset = true;
        for (int num : arr2)
            if (!set1.contains(num))
                isSubset = false;
        System.out.println("Is arr2 a subset of arr1? " + isSubset);
    }

    // Program 7: Find All Non-Repeating Elements in an Array
    public static void nonRepeatingElements(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : arr)
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        System.out.print("Non-Repeating Elements: ");
        for (int num : arr)
            if (freqMap.get(num) == 1)
                System.out.print(num + " ");
        System.out.println();
    }

    // Program 8: Check if a Number is Armstrong
    public static void isArmstrong(int number) {
        int sum = 0, temp = number, digits = String.valueOf(number).length();
        while (temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.println(number + " is Armstrong: " + (sum == number));
    }

    // Program 9: Prime Numbers in a Given Range
    public static void primeNumbersInRange(int a, int b) {
        System.out.print("Prime Numbers: ");
        for (int num = a; num <= b; num++) {
            boolean isPrime = num > 1;
            for (int i = 2; i <= Math.sqrt(num); i++)
                if (num % i == 0)
                    isPrime = false;
            if (isPrime)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    // Program 10: Print Fibonacci Series up to Nth Term
    public static void fibonacciSeries(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Series: " + a + " " + b);
        for (int i = 2; i < n; i++) {
            int next = a + b;
            System.out.print(" " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    // Program 11: Check if a Number is Strong Number
    public static void isStrongNumber(int number) {
        int sum = 0, temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        System.out.println(number + " is Strong Number: " + (sum == number));
    }

    // Helper function for factorial calculation
    public static int factorial(int n) {
        return (n == 0) ? 1 : n * factorial(n - 1);
    }

    // Program 12: Find GCD of Two Numbers
    public static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    // Program 13: Find LCM of Two Numbers
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // Program 14: Sum of Digits of a Number
    public static void sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Program 15: Find Roots of a Quadratic Equation
    public static void quadraticRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and different: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same: " + root);
        } else {
            System.out.println("Roots are complex.");
        }
    }

    // Program 16: Check if a String is Palindrome
    public static void isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println(str + " is Palindrome: " + str.equals(reversed));
    }

    // Program 17: Count the Frequency of Each Character in a String
    public static void characterFrequency(String str) {
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }
        System.out.println("Character Frequency: " + freqMap);
    }

    // Program 18: Reverse Words in a Sentence
    public static void reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversed = new StringBuilder();
        for (String word : words) {
            reversed.insert(0, word + " ");
        }
        System.out.println("Reversed Sentence: " + reversed.toString().trim());
    }

    // Program 20: Check if a Number is Prime
    public static void isPrime(int number) {
        boolean isPrime = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(number + " is Prime: " + isPrime);
    }

    // Program 21: Sum of All Elements in an Array
    public static void sumOfArray(int[] arr) {
        int sum = 0;
        for (int num : arr)
            sum += num;
        System.out.println("Sum of Array Elements: " + sum);
    }

    // Program 22: Find Maximum and Minimum Elements in an Array
    public static void maxMinInArray(int[] arr) {
        int max = arr[0], min = arr[0];
        for (int num : arr) {
            if (num > max)
                max = num;
            if (num < min)
                min = num;
        }
        System.out.println("Max: " + max + ", Min: " + min);
    }

    // Program 23: Count the Number of Vowels and Consonants in a String
    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;
        for (char ch : str.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(ch) != -1)
                vowels++;
            else if (Character.isLetter(ch))
                consonants++;
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // Program 24: Find the Largest Word in a Sentence
    public static void largestWord(String sentence) {
        String[] words = sentence.split(" ");
        String largest = "";
        for (String word : words) {
            if (word.length() > largest.length())
                largest = word;
        }
        System.out.println("Largest Word: " + largest);
    }

    // Program 25: Calculate Simple Interest
    public static void calculateSimpleInterest(double principal, double rate, int time) {
        double simpleInterest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + simpleInterest);
    }

    public static void main(String[] args) {
        // Example calls for each method
        rearrangeArray(new int[] { 3, 1, 2, 4, 5 });
        findSecondSmallestLargest(new int[] { 3, 1, 2, 4, 5 });
        sortByFrequency(new int[] { 3, 3, 2, 1, 2, 2 });
        rotateArray(new int[] { 1, 2, 3, 4, 5 }, 2);
        removeDuplicates(new int[] { 1, 2, 2, 3, 4, 4, 5 });
        isSubset(new int[] { 1, 2, 3, 4, 5 }, new int[] { 2, 4 });
        nonRepeatingElements(new int[] { 4, 5, 4, 5, 6, 7 });
        isArmstrong(153);
        primeNumbersInRange(10, 20);
        fibonacciSeries(10);
        isStrongNumber(145);
        System.out.println("GCD: " + gcd(12, 15));
        System.out.println("LCM: " + lcm(12, 15));
        sumOfDigits(1234);
        quadraticRoots(1, -3, 2);
        isPalindrome("madam");
        characterFrequency("hello world");
        reverseWords("Java is fun");
        System.out.println("Factorial of 5: " + factorial(5));
        isPrime(29);
        sumOfArray(new int[] { 1, 2, 3, 4, 5 });
        maxMinInArray(new int[] { 12, 7, 9, 3, 15 });
        countVowelsConsonants("Programming");
        largestWord("Find the largest word in this sentence");
        calculateSimpleInterest(1000, 5, 2);
    }
}
