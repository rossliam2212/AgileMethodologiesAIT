public class Grader {

    public char calculateGrade(int examMark, int courseWorkMark) throws GraderExceptionHandler {
        if (examMark < 0 || examMark > 75 || courseWorkMark < 0 || courseWorkMark > 25)
            throw new GraderExceptionHandler("FM");

        int overallResult = examMark + courseWorkMark;

        if (overallResult >= 70) return 'A';
        else if (overallResult >= 50) return 'B';
        else if (overallResult >= 30) return 'C';
        else return 'D';
    }


//    public char calculateGrade(int examMark, int courseWorkMark) throws GraderExceptionHandler {
//        if (examMark < 0)
//            throw new GraderExceptionHandler("Invalid examMark (<0)");
//        else if (examMark > 75)
//            throw new GraderExceptionHandler("Invalid examMark (>75)");
//        else if (courseWorkMark < 0)
//            throw new GraderExceptionHandler("Invalid courseWorkMark (<0)");
//        else if (courseWorkMark > 25)
//            throw new GraderExceptionHandler("Invalid courseWorkMark (>25)");
//
//
//        int overallResult = examMark + courseWorkMark;
//
//        if (overallResult >= 70) return 'A';
//        else if (overallResult >= 50) return 'B';
//        else if (overallResult >= 30) return 'C';
//        else return 'D';
//    }
}
