## Various methods as well as constructors present in Scanner class

| **Method Name**                                    | **Parameters**                                | **Explanation**                                                                                           |
|----------------------------------------------------|-----------------------------------------------|-----------------------------------------------------------------------------------------------------------|
| `Scanner(Readable source)`                         | `Readable source`                             | Creates a scanner that scans the given source.                                                            |
| `Scanner(InputStream source)`                      | `InputStream source`                          | Creates a scanner that scans the specified input stream.                                                  |
| `Scanner(InputStream source, String charsetName)`  | `InputStream source, String charsetName`      | Creates a scanner that scans the specified input stream with the specified character set.                 |
| `Scanner(InputStream source, Charset charset)`     | `InputStream source, Charset charset`         | Creates a scanner that scans the specified input stream with the specified charset.                       |
| `Scanner(File source)`                             | `File source`                                 | Creates a scanner that scans the specified file.                                                          |
| `Scanner(File source, String charsetName)`         | `File source, String charsetName`             | Creates a scanner that scans the specified file with the specified character set.                         |
| `Scanner(File source, Charset charset)`            | `File source, Charset charset`                | Creates a scanner that scans the specified file with the specified charset.                               |
| `Scanner(Path source)`                             | `Path source`                                 | Creates a scanner that scans the specified path.                                                          |
| `Scanner(Path source, String charsetName)`         | `Path source, String charsetName`             | Creates a scanner that scans the specified path with the specified character set.                         |
| `Scanner(Path source, Charset charset)`            | `Path source, Charset charset`                | Creates a scanner that scans the specified path with the specified charset.                               |
| `Scanner(String source)`                           | `String source`                               | Creates a scanner that scans the specified string.                                                        |
| `Scanner(ReadableByteChannel source)`              | `ReadableByteChannel source`                  | Creates a scanner that scans the specified channel.                                                       |
| `Scanner(ReadableByteChannel source, String cs)`   | `ReadableByteChannel source, String cs`       | Creates a scanner that scans the specified channel with the specified character set.                      |
| `Scanner(ReadableByteChannel source, Charset cs)`  | `ReadableByteChannel source, Charset cs`      | Creates a scanner that scans the specified channel with the specified charset.                            |
| `close()`                                          | None                                          | Closes the scanner.                                                                                       |
| `ioException()`                                    | None                                          | Returns the last `IOException` encountered by the scanner.                                                |
| `delimiter()`                                      | None                                          | Returns the current delimiter pattern.                                                                    |
| `useDelimiter(Pattern pattern)`                    | `Pattern pattern`                             | Sets the delimiter pattern.                                                                               |
| `useDelimiter(String pattern)`                     | `String pattern`                              | Sets the delimiter pattern.                                                                               |
| `locale()`                                         | None                                          | Returns the current locale of the scanner.                                                                |
| `useLocale(Locale locale)`                         | `Locale locale`                               | Sets the locale of the scanner.                                                                           |
| `radix()`                                          | None                                          | Returns the current radix of the scanner.                                                                 |
| `useRadix(int radix)`                              | `int radix`                                   | Sets the radix of the scanner.                                                                             |
| `match()`                                          | None                                          | Returns the match result of the last scanning operation.                                                  |
| `toString()`                                       | None                                          | Returns the string representation of the scanner.                                                         |
| `hasNext()`                                        | None                                          | Returns true if there is another token in the input.                                                      |
| `next()`                                           | None                                          | Returns the next complete token from the scanner.                                                         |
| `remove()`                                         | None                                          | Unsupported operation in `Scanner`.                                                                       |
| `hasNext(String pattern)`                          | `String pattern`                              | Returns true if the next token matches the specified pattern.                                             |
| `next(String pattern)`                             | `String pattern`                              | Returns the next token if it matches the specified pattern.                                               |
| `hasNext(Pattern pattern)`                         | `Pattern pattern`                             | Returns true if the next token matches the specified pattern.                                             |
| `next(Pattern pattern)`                            | `Pattern pattern`                             | Returns the next token if it matches the specified pattern.                                               |
| `hasNextLine()`                                    | None                                          | Returns true if there is another line in the input.                                                       |
| `nextLine()`                                       | None                                          | Advances the scanner to the next line and returns the input that was skipped.                             |
| `findInLine(String pattern)`                       | `String pattern`                              | Attempts to find the next occurrence of the specified pattern ignoring delimiters.                        |
| `findInLine(Pattern pattern)`                      | `Pattern pattern`                             | Attempts to find the next occurrence of the specified pattern ignoring delimiters.                        |
| `findWithinHorizon(String pattern, int horizon)`   | `String pattern, int horizon`                 | Attempts to find the next occurrence of the specified pattern within the specified horizon.               |
| `findWithinHorizon(Pattern pattern, int horizon)`  | `Pattern pattern, int horizon`                | Attempts to find the next occurrence of the specified pattern within the specified horizon.               |
| `skip(Pattern pattern)`                            | `Pattern pattern`                             | Skips input that matches the specified pattern, ignoring delimiters.                                       |
| `skip(String pattern)`                             | `String pattern`                              | Skips input that matches the specified pattern, ignoring delimiters.                                       |
| `hasNextBoolean()`                                 | None                                          | Returns true if the next token can be interpreted as a boolean value.                                     |
| `nextBoolean()`                                    | None                                          | Scans the next token as a boolean value.                                                                  |
| `hasNextByte()`                                    | None                                          | Returns true if the next token can be interpreted as a byte value.                                        |
| `hasNextByte(int radix)`                           | `int radix`                                   | Returns true if the next token can be interpreted as a byte value in the specified radix.                 |
| `nextByte()`                                       | None                                          | Scans the next token as a byte value.                                                                     |
| `nextByte(int radix)`                              | `int radix`                                   | Scans the next token as a byte value in the specified radix.                                              |
| `hasNextShort()`                                   | None                                          | Returns true if the next token can be interpreted as a short value.                                       |
| `hasNextShort(int radix)`                          | `int radix`                                   | Returns true if the next token can be interpreted as a short value in the specified radix.                |
| `nextShort()`                                      | None                                          | Scans the next token as a short value.                                                                    |
| `nextShort(int radix)`                             | `int radix`                                   | Scans the next token as a short value in the specified radix.                                             |
| `hasNextInt()`                                     | None                                          | Returns true if the next token can be interpreted as an int value.                                        |
| `hasNextInt(int radix)`                            | `int radix`                                   | Returns true if the next token can be interpreted as an int value in the specified radix.                 |
| `nextInt()`                                        | None                                          | Scans the next token as an int value.                                                                     |
| `nextInt(int radix)`                               | `int radix`                                   | Scans the next token as an int value in the specified radix.                                              |
| `hasNextLong()`                                    | None                                          | Returns true if the next token can be interpreted as a long value.                                        |
| `hasNextLong(int radix)`                           | `int radix`                                   | Returns true if the next token can be interpreted as a long value in the specified radix.                 |
| `nextLong()`                                       | None                                          | Scans the next token as a long value.                                                                     |
| `nextLong(int radix)`                              | `int radix`                                   | Scans the next token as a long value in the specified radix.                                              |
| `hasNextFloat()`                                   | None                                          | Returns true if the next token can be interpreted as a float value.                                       |
| `nextFloat()`                                      | None                                          | Scans the next token as a float value.                                                                    |
| `hasNextDouble()`                                  | None                                          | Returns true if the next token can be interpreted as a double value.                                      |
| `nextDouble()`                                     | None                                          | Scans the next token as a double value.                                                                   |
| `hasNextBigInteger()`                              | None                                          | Returns true if the next token can be interpreted as a BigInteger value.                                  |
| `hasNextBigInteger(int radix)`                     | `int radix`                                   | Returns true if the next token can be interpreted as a BigInteger value in the specified radix.           |
| `nextBigInteger()`                                 | None                                          | Scans the next token as a BigInteger value.                                                               |
| `nextBigInteger(int radix)`                        | `int radix`                                   | Scans the next token as a BigInteger value in the specified radix.                                        |
| `hasNextBigDecimal()`                              | None                                          | Returns true if the next token can be interpreted as a BigDecimal value.                                  |
| `nextBigDecimal()`                                 | None                                          | Scans the next token as a BigDecimal value.                                                               |
| `reset()`                                          | None                                          | Resets the scanner to its initial state.                                                                  |
| `tokens()`                                         | None                                          | Returns a stream of tokens from the scanner.                                                              |
| `findAll(Pattern pattern)`                         | `Pattern pattern`                             | Returns a stream of match results for the specified pattern.                                              |
| `findAll(String pattern)`                          | `String pattern`

### Total Constructors and methods present in scanner class

1. **Constructors**: 15 constructors
2. **Methods**: 61 methods

### Constructors
1. `Scanner(Readable source)`
2. `Scanner(InputStream source)`
3. `Scanner(InputStream source, String charsetName)`
4. `Scanner(InputStream source, Charset charset)`
5. `Scanner(File source)`
6. `Scanner(File source, String charsetName)`
7. `Scanner(File source, Charset charset)`
8. `Scanner(Path source)`
9. `Scanner(Path source, String charsetName)`
10. `Scanner(Path source, Charset charset)`
11. `Scanner(String source)`
12. `Scanner(ReadableByteChannel source)`
13. `Scanner(ReadableByteChannel source, String cs)`
14. `Scanner(ReadableByteChannel source, Charset cs)`

### Methods
1. `close()`
2. `ioException()`
3. `delimiter()`
4. `useDelimiter(Pattern pattern)`
5. `useDelimiter(String pattern)`
6. `locale()`
7. `useLocale(Locale locale)`
8. `radix()`
9. `useRadix(int radix)`
10. `match()`
11. `toString()`
12. `hasNext()`
13. `next()`
14. `remove()`
15. `hasNext(String pattern)`
16. `next(String pattern)`
17. `hasNext(Pattern pattern)`
18. `next(Pattern pattern)`
19. `hasNextLine()`
20. `nextLine()`
21. `findInLine(String pattern)`
22. `findInLine(Pattern pattern)`
23. `findWithinHorizon(String pattern, int horizon)`
24. `findWithinHorizon(Pattern pattern, int horizon)`
25. `skip(Pattern pattern)`
26. `skip(String pattern)`
27. `hasNextBoolean()`
28. `nextBoolean()`
29. `hasNextByte()`
30. `hasNextByte(int radix)`
31. `nextByte()`
32. `nextByte(int radix)`
33. `hasNextShort()`
34. `hasNextShort(int radix)`
35. `nextShort()`
36. `nextShort(int radix)`
37. `hasNextInt()`
38. `hasNextInt(int radix)`
39. `nextInt()`
40. `nextInt(int radix)`
41. `hasNextLong()`
42. `hasNextLong(int radix)`
43. `nextLong()`
44. `nextLong(int radix)`
45. `hasNextFloat()`
46. `nextFloat()`
47. `hasNextDouble()`
48. `nextDouble()`
49. `hasNextBigInteger()`
50. `hasNextBigInteger(int radix)`
51. `nextBigInteger()`
52. `nextBigInteger(int radix)`
53. `hasNextBigDecimal()`
54. `nextBigDecimal()`
55. `reset()`
56. `tokens()`
57. `findAll(Pattern pattern)`
58. `findAll(String pattern)`
59. `next()`
60. `hasNextBigDecimal()`
61. `nextBigDecimal()`

### Total Count
Combining constructors and methods:
- **Constructors**: 14
- **Methods**: 61

**Total**: 14 + 61 = 75

Therefore, the `Scanner` class contains a total of **75 methods** including constructors.

# Different constructors of the `Scanner` class

The different constructors of the `Scanner` class are used to create `Scanner` objects that can read input from various sources. Here is a summary of each constructor and when you might use it:

### 1. `Scanner(Readable source)`
**Usage**: When you have a `Readable` source, such as a `StringReader` or `BufferedReader`.

```java
import java.util.Scanner;
import java.io.StringReader;

public class Example {
    public static void main(String[] args) {
        StringReader reader = new StringReader("Hello, this is a test string.");
        Scanner scanner = new Scanner(reader);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 2. `Scanner(InputStream source)`
**Usage**: When you want to read from an `InputStream`, such as `System.in` or a file input stream.

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a line of text:");
        String line = scanner.nextLine();
        System.out.println("You entered: " + line);
        scanner.close();
    }
}
```

### 3. `Scanner(InputStream source, String charsetName)`
**Usage**: When you want to read from an `InputStream` using a specific character set.

```java
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(inputStream, "UTF-8");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 4. `Scanner(InputStream source, Charset charset)`
**Usage**: When you want to read from an `InputStream` using a specific `Charset`.

```java
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 5. `Scanner(File source)`
**Usage**: When you want to read from a file.

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### 6. `Scanner(File source, String charsetName)`
**Usage**: When you want to read from a file using a specific character set.

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file, "UTF-8");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### 7. `Scanner(File source, Charset charset)`
**Usage**: When you want to read from a file using a specific `Charset`.

```java
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            Scanner scanner = new Scanner(file, StandardCharsets.UTF_8);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
```

### 8. `Scanner(Path source)`
**Usage**: When you want to read from a file path.

```java
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try (Scanner scanner = new Scanner(Files.newBufferedReader(path))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 9. `Scanner(Path source, String charsetName)`
**Usage**: When you want to read from a file path using a specific character set.

```java
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try (Scanner scanner = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 10. `Scanner(Path source, Charset charset)`
**Usage**: When you want to read from a file path using a specific `Charset`.

```java
import java.util.Scanner;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");
        try (Scanner scanner = new Scanner(Files.newBufferedReader(path, StandardCharsets.UTF_8))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
```

### 11. `Scanner(String source)`
**Usage**: When you want to read from a `String`.

```java
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        Scanner scanner = new Scanner(input);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 12. `Scanner(ReadableByteChannel source)`
**Usage**: When you want to read from a `ReadableByteChannel`, such as a channel created from an input stream.

```java
import java.util.Scanner;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ReadableByteChannel channel = Channels.newChannel(inputStream);
        Scanner scanner = new Scanner(channel);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 13. `Scanner(ReadableByteChannel source, String charsetName)`
**Usage**: When you want to read from a `ReadableByteChannel` using a specific character set.

```java
import java.util.Scanner;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ReadableByteChannel channel = Channels.newChannel(inputStream);
        Scanner scanner = new Scanner(channel, "UTF-8");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

### 14. `Scanner(ReadableByteChannel source, Charset charset)`
**Usage**: When you want to read from a `ReadableByteChannel` using a specific `Charset`.

```java
import java.util.Scanner;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        String input = "Hello, this is a test string.";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));
        ReadableByteChannel channel = Channels.newChannel(inputStream);
        Scanner scanner = new Scanner(channel, StandardCharsets.UTF_8);
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
        scanner.close();
    }
}
```

Each of these constructors is useful in different scenarios depending on the source of the input

# Charset Supported in JAVA 

In Java, the `java.nio.charset` package provides various character sets (`Charset`) that you can use to encode and decode textual data. Here are some commonly used `Charset` constants and their descriptions:

1. **Standard Charsets**:
    - **UTF-8**: 8-bit UCS Transformation Format.
    - **UTF-16**: 16-bit UCS Transformation Format, byte order identified by an optional byte-order mark (BOM).
    - **UTF-16BE**: 16-bit UCS Transformation Format, big-endian byte order.
    - **UTF-16LE**: 16-bit UCS Transformation Format, little-endian byte order.
    - **ISO-8859-1**: ISO Latin Alphabet No. 1, 8-bit single-byte encoding.
    - **US-ASCII**: Seven-bit ASCII, a.k.a. ISO646-US, a.k.a. the Basic Latin block of the Unicode character set.

2. **Additional Charsets**:
    - **UTF-32**: 32-bit UCS Transformation Format.
    - **UTF-32BE**: 32-bit UCS Transformation Format, big-endian byte order.
    - **UTF-32LE**: 32-bit UCS Transformation Format, little-endian byte order.
    - **ISO-8859-2 to ISO-8859-16**: Various ISO Latin character sets.
    - **windows-1250 to windows-1258**: Microsoft-specific character sets for Central and Eastern Europe, Vietnamese, etc.
    - **Shift_JIS**: Japanese character set.
    - **EUC-JP**: Extended UNIX Code for Japanese.
    - **GBK**: Extended Chinese character set.
    - **Big5**: Traditional Chinese character set.

3. **Historical and Other Charsets**:
    - **KOI8-R**: Russian character set.
    - **KOI8-U**: Ukrainian character set.
    - **X-ISO-10646-UCS-4-3412**: UCS-4 with hexadecimal representation.

### Example Usage:
Here's an example demonstrating the usage of different charsets:

```java
import java.nio.charset.Charset;

public class CharsetExample {
    public static void main(String[] args) {
        // Using standard charsets
        Charset utf8 = Charset.forName("UTF-8");
        Charset utf16 = Charset.forName("UTF-16");
        Charset iso88591 = Charset.forName("ISO-8859-1");
        
        // Using additional charsets
        Charset shiftJis = Charset.forName("Shift_JIS");
        Charset gbk = Charset.forName("GBK");
        
        // Printing the charsets
        System.out.println("UTF-8 Charset: " + utf8);
        System.out.println("UTF-16 Charset: " + utf16);
        System.out.println("ISO-8859-1 Charset: " + iso88591);
        System.out.println("Shift_JIS Charset: " + shiftJis);
        System.out.println("GBK Charset: " + gbk);
        
        // Displaying available charsets
        System.out.println("\nAvailable Charsets:");
        for (String charset : Charset.availableCharsets().keySet()) {
            System.out.println(charset);
        }
    }
}
```

### Output:
```
UTF-8 Charset: UTF-8
UTF-16 Charset: UTF-16
ISO-8859-1 Charset: ISO-8859-1
Shift_JIS Charset: Shift_JIS
GBK Charset: GBK

Available Charsets:
Big5
Big5-HKSCS
CESU-8
EUC-JP
EUC-KR
GB18030
GBK
...
UTF-16LE-BOM
UTF-32
UTF-32BE
UTF-32LE
UTF-8
windows-1250
windows-1251
...
```


