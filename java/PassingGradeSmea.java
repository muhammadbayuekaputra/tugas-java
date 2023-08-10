import java.util.Scanner;

public class GradeSMK {
    public static void main(String[] args) {
        int mtk, inggris, indo;
        int GradeSMK, GradeSastra, GradeTIK;
        boolean isPasssingSMK, isPasssingSastra, isPasssingTIK;
        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        PassingGradeSMK = 73;
        PassingGradeSastra = 75;
        PassingGradeTIK = 80;

        System.out.println("masukan nilai Ujian Matematika :");
        mtk = input.nextInt();

        System.out.println("masukan nilai Ujian B Indonesia :");
        indo = input.nextInt();

        System.out.println("masukan nilai Ujian B Inggris :");
        inggris = input.nextInt();

        averageUjian = (mtk + indo + inggris) / 3;
        averageBahasa = (indo + inggris) / 2;

        isPassingSMK = averageUjian >= passingGradeSMK;
        isPassingSastra = averageBahasa >= passingGradeSastra;
        isPassingTIK = mtk >= PassingGradeTIK;

        System.out.println(
                "\n\nHasil dari simulasi untuk persyaratan penerimaan calon siswa di smk adalah sebagai berikut :");
        System.out.println("==================================================================");
        System.out.prinln("apakah anda memenuhi untuk masuk ke smk : " + isPassingSMK);
        System.out.prinln("apakah anda memenuhi untuk masuk jurusan Sastra : " + isPassingSAstra);
        System.out.prinln("apakah anda memenuhi untuk masuk jurusan TIK : " + isPassingTIK);

    }
}
