package lesson4.exceptions;

public class Filesystem {

    void deleteFileByName(String name) throws NoSuchFileException, FilesystemIsNotAvailableException {
        if (name.equals("ostap.txt1")) {
            throw new FilesystemIsNotAvailableException();
        } else if (name.equals("koza")) {
            throw new LaptopIsDeadException();
        }
    }

    public static void main(String[] args) throws NoSuchFileException {
        //bad example of handling exceptions
      // deleteOnFilesystem();

        //good example of handling
      //  goodExample();

        //calling to show runtime exception
       runtimeExample();
    }

    private static void goodExample() throws NoSuchFileException {
        Filesystem filesystem = new Filesystem();
        try {
            filesystem.deleteFileByName("ostap.txt1");
        } catch (FilesystemIsNotAvailableException e) {
            //printing stacktrace to show it, but not to crash
            e.printStackTrace();
            //throw new RuntimeException(e);
        } finally {
            System.out.println("Doing anyways");
        }
    }

    private static void runtimeExample() throws NoSuchFileException {
        Filesystem filesystem = new Filesystem();
        try {
            filesystem.deleteFileByName("ostap.txt1");
        } catch (FilesystemIsNotAvailableException e) {
            throw new RuntimeException(e);
        }
    }

    private static void deleteOnFilesystem() throws NoSuchFileException {
        try {
            yetAnotherLevel();
        } catch (FilesystemIsNotAvailableException e) {
            throw new RuntimeException(e);
        }
    }

    private static void yetAnotherLevel() throws NoSuchFileException, FilesystemIsNotAvailableException {
        Filesystem filesystem = new Filesystem();
        filesystem.deleteFileByName("ostap.txt");
    }
}

class NoSuchFileException extends Exception {
    public NoSuchFileException() {
        super("No such file exist");
    }
}

class FilesystemIsNotAvailableException extends Exception {
    public FilesystemIsNotAvailableException() {
        super("Filesystem is busy");
    }
}

class LaptopIsDeadException extends RuntimeException {
    public LaptopIsDeadException() {
        super("Laptop died");
    }
}
