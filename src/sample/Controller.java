package sample;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button submit;

    @FXML
    private Button A;

    @FXML
    private Button B;

    @FXML private Label label;
    @FXML private TextField textField;
    @FXML private Label error;
    @FXML private Button C;
    @FXML private Button D;
    @FXML private Button E;
    @FXML private Button F;
    @FXML private Button G;
    @FXML private Button H;
    @FXML private Button I;
    @FXML private Button J;
    @FXML private Button K;
    @FXML private Button L;
    @FXML private Button M;
    @FXML private Button N;
    @FXML private Button O;
    @FXML private Button P;
    @FXML private Button Q;
    @FXML private Button R;
    @FXML private Button S;
    @FXML private Button T;
    @FXML private Button U;
    @FXML private Button V;
    @FXML private Button W;
    @FXML private Button X;
    @FXML private Button Y;
    @FXML private Button Z;
    @FXML private Label a;
    @FXML private Label b;
    @FXML private Label c;
    @FXML private Label d;
    @FXML private Label e;
    @FXML private Label f;
    @FXML private Label g;
    @FXML private Label h;
    @FXML private Label i;
    @FXML private Label j;
    @FXML private Label k;
    @FXML private Label l;
    @FXML private Label m;
    @FXML private Label n;
    @FXML private Label o;
    @FXML private Label p;
    @FXML private Label q;
    @FXML private Label r;
    @FXML private Label s;
    @FXML private Label t;
    @FXML private Label u;
    @FXML private Label v;
    @FXML private Label w;
    @FXML private Label x;
    @FXML private Label y;
    @FXML private Label z;
    @FXML private ListView<Integer> score;
    @FXML private ListView<String> previousWords;
    @FXML private Label totalScore;
    ArrayList<String> words=new ArrayList<>();
    ArrayList<Integer> Scores=new ArrayList<>();
    String str="";
    int totalPoints=0;
    int totalChar=0;
    int points=0;
    static char chars[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    static int nCharacters[]={9,2,2,4,12,2,3,2,8,1,1,4,2,6,8,2,1,6,4,6,4,2,2,1,2,1};
    static int valueOfChar[]={1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
    @FXML void actionA(ActionEvent event) {
        if(nCharacters[0]==0){
            error.setText("No more A letter in game");
            A.setDisable(true);
        }
        else{
            textField.setText(str+"A");
            str=textField.getText();
            nCharacters[0]=nCharacters[0]-1;
            a.setText(String.valueOf(nCharacters[0]));
        }
    }
    @FXML void actionB(ActionEvent event) {
        if(nCharacters[1]==0){
            error.setText("No more B letter in game");
            B.setDisable(true);
        }

        else{
            textField.setText(str+"B");
            str=textField.getText();
            nCharacters[1]=nCharacters[1]-1;
            b.setText(String.valueOf(nCharacters[1]));
        }
    }
    @FXML void actionC(ActionEvent event) {
        if(nCharacters[2]==0){
            error.setText("No more C letter in game");
            C.setDisable(true);
        }

        else{
            textField.setText(str+"C");
            str=textField.getText();
            nCharacters[2]=nCharacters[2]-1;
            c.setText(String.valueOf(nCharacters[2]));
        }
    }
    @FXML void onactionD(ActionEvent event) {
        if(nCharacters[3]==0){
            error.setText("No more D letter in game");
            D.setDisable(true);
        }
        else{
            textField.setText(str+"D");
            str=textField.getText();
            nCharacters[3]=nCharacters[3]-1;
            d.setText(String.valueOf(nCharacters[3]));
        }
    }

    @FXML void onactionE(ActionEvent event) {
        if(nCharacters[4]==0){
            error.setText("No more E letter in game");
            E.setDisable(true);
        }
        else{
            textField.setText(str+"E");
            str=textField.getText();
            nCharacters[4]=nCharacters[4]-1;
            e.setText(String.valueOf(nCharacters[4]));
        }
    }
    @FXML void onactionF(ActionEvent event) {
        if(nCharacters[5]==0){
            error.setText("No more F letter in game");
            F.setDisable(true);
        }
        else{
            textField.setText(str+"F");
            str=textField.getText();
            nCharacters[5]=nCharacters[5]-1;
            f.setText(String.valueOf(nCharacters[5]));
        }
    }
    @FXML void onactionG(ActionEvent event) {
        if(nCharacters[6]==0){
            error.setText("No more G letter in game");
            G.setDisable(true);
        }
        else{
            textField.setText(str+"G");
            str=textField.getText();
            nCharacters[6]=nCharacters[6]-1;
            g.setText(String.valueOf(nCharacters[6]));
        }
    }
    @FXML void onactionH(ActionEvent event) {
        if(nCharacters[7]==0){
            error.setText("No more H letter in game");
            H.setDisable(true);
        }
        else{
            textField.setText(str+"H");
            str=textField.getText();
            nCharacters[7]=nCharacters[7]-1;
            h.setText(String.valueOf(nCharacters[7]));
        }
    }
    @FXML void onactionI(ActionEvent event) {
        if(nCharacters[8]==0){
            error.setText("No more I letter in game");
            I.setDisable(true);
        }
        else{
            textField.setText(str+"I");
            str=textField.getText();
            nCharacters[8]=nCharacters[8]-1;
            i.setText(String.valueOf(nCharacters[8]));
        }
    }
    @FXML void onactionJ(ActionEvent event) {
        if(nCharacters[9]==0){
            error.setText("No more J letter in game");
            J.setDisable(true);
        }
        else{
            textField.setText(str+"J");
            str=textField.getText();
            nCharacters[9]=nCharacters[9]-1;
            j.setText(String.valueOf(nCharacters[9]));
        }
    }
    @FXML void onactionK(ActionEvent event) {
        if(nCharacters[10]==0){
            error.setText("No more K letter in game");
            K.setDisable(true);
        }
        else{
            textField.setText(str+"K");
            str=textField.getText();
            nCharacters[10]=nCharacters[10]-1;
            k.setText(String.valueOf(nCharacters[10]));
        }
    }
    @FXML void onactionL(ActionEvent event) {
        if(nCharacters[11]==0){
            error.setText("No more L letter in game");
            L.setDisable(true);
        }
        else{
            textField.setText(str+"L");
            str=textField.getText();
            nCharacters[11]=nCharacters[11]-1;
            l.setText(String.valueOf(nCharacters[11]));
        }
    }
    @FXML void onactionM(ActionEvent event) {
        if(nCharacters[12]==0){
            error.setText("No more M letter in game");
            M.setDisable(true);
        }
        else{
            textField.setText(str+"M");
            str=textField.getText();
            nCharacters[12]=nCharacters[12]-1;
            m.setText(String.valueOf(nCharacters[12]));
        }
    }
    @FXML void onactionN(ActionEvent event) {
        if(nCharacters[13]==0){
            error.setText("No more N letter in game");
            N.setDisable(true);
        }
        else{
            textField.setText(str+"N");
            str=textField.getText();
            nCharacters[13]=nCharacters[13]-1;
            n.setText(String.valueOf(nCharacters[13]));
        }
    }
    @FXML void onactionO(ActionEvent event) {
        if(nCharacters[14]==0){
            error.setText("No more O letter in game");
            O.setDisable(true);
        }
        else{
            textField.setText(str+"O");
            str=textField.getText();
            nCharacters[14]=nCharacters[14]-1;
            o.setText(String.valueOf(nCharacters[14]));
        }
    }
    @FXML void onactionP(ActionEvent event) {
        if(nCharacters[15]==0){
            error.setText("No more P letter in game");
            P.setDisable(true);
        }
        else{
            textField.setText(str+"P");
            str=textField.getText();
            nCharacters[15]=nCharacters[15]-1;
            p.setText(String.valueOf(nCharacters[15]));
        }
    }
    @FXML void onactionQ(ActionEvent event) {
        if(nCharacters[16]==0){
            error.setText("No more Q letter in game");
            Q.setDisable(true);
        }
        else{
            textField.setText(str+"Q");
            str=textField.getText();
            nCharacters[16]=nCharacters[16]-1;
            q.setText(String.valueOf(nCharacters[16]));
        }
    }
    @FXML void onactionR(ActionEvent event) {
        if(nCharacters[17]==0){
            error.setText("No more R letter in game");
            R.setDisable(true);
        }
        else{
            textField.setText(str+"R");
            str=textField.getText();
            nCharacters[17]=nCharacters[17]-1;
            r.setText(String.valueOf(nCharacters[17]));
        }
    }
    @FXML void onactionS(ActionEvent event) {
        if(nCharacters[18]==0){
            error.setText("No more S letter in game");
            S.setDisable(true);
        }
        else{
            textField.setText(str+"S");
            str=textField.getText();
            nCharacters[18]=nCharacters[18]-1;
            s.setText(String.valueOf(nCharacters[18]));
        }
    }
    @FXML void onactionT(ActionEvent event) {
        if(nCharacters[19]==0){
            error.setText("No more T letter in game");
            T.setDisable(true);
        }
        else{
            textField.setText(str+"T");
            str=textField.getText();
            nCharacters[19]=nCharacters[19]-1;
            t.setText(String.valueOf(nCharacters[19]));
        }
    }
    @FXML void onactionU(ActionEvent event) {
        if(nCharacters[20]==0){
            error.setText("No more U letter in game");
            U.setDisable(true);
        }
        else{
            textField.setText(str+"U");
            str=textField.getText();
            nCharacters[20]=nCharacters[20]-1;
            u.setText(String.valueOf(nCharacters[20]));
        }
    }
    @FXML void onactionV(ActionEvent event) {
        if(nCharacters[21]==0){
            error.setText("No more V letter in game");
            V.setDisable(true);
        }
        else{
            textField.setText(str+"V");
            str=textField.getText();
            nCharacters[21]=nCharacters[21]-1;
            v.setText(String.valueOf(nCharacters[21]));
        }
    }
    @FXML void onactionW(ActionEvent event) {
        if(nCharacters[22]==0){
            error.setText("No more W letter in game");
            W.setDisable(true);
        }
        else{
            textField.setText(str+"W");
            str=textField.getText();
            nCharacters[22]=nCharacters[22]-1;
            w.setText(String.valueOf(nCharacters[22]));
        }
    }
    @FXML void onactionX(ActionEvent event) {
        if(nCharacters[23]==0){
            error.setText("No more X letter in game");
            X.setDisable(true);
        }
        else{
            textField.setText(str+"X");
            str=textField.getText();
            nCharacters[23]=nCharacters[23]-1;
            x.setText(String.valueOf(nCharacters[23]));

        }
    }
    @FXML void onactionY(ActionEvent event) {
        if(nCharacters[24]==0){
            error.setText("No more Y letter in game");
            Y.setDisable(true);
        }
        else{
            textField.setText(str+"Y");
            str=textField.getText();
            nCharacters[24]=nCharacters[24]-1;
            y.setText(String.valueOf(nCharacters[24]));
        }
    }
    @FXML void onactionZ(ActionEvent event) {
        if(nCharacters[25]==0){
            error.setText("No more Z letter in game");
            Z.setDisable(true);
        }
        else{
            textField.setText(str+"Z");
            str=textField.getText();
            nCharacters[25]=nCharacters[25]-1;
            z.setText(String.valueOf(nCharacters[25]));
        }
    }
    @FXML void handleButtonAction(ActionEvent event) {
        String word=textField.getText();
        totalChar=totalChar+word.length();
        if(totalChar==96){
            error.setText("Game Over!");
        }
        if((word=="")){

            error.setText("Please SELECT the word.");
        }
        else if((word.length()==1)){

            error.setText("Word is Too short.");
        }
        else if((word.length()>8)){

            error.setText("Word is Too long.");
        }
        else if(!(word.contains("A")||word.contains("E")||word.contains("I")||word.contains("O")||word.contains("U"))){

            error.setText("Word doesn't include vowel.");
        }
        else {
            words.add(word);
            ObservableList<String> items = FXCollections.observableArrayList(words);
            previousWords.setItems(items);

            for(int i=0;i<word.length();i++) {
                for(int j=0;j<chars.length;j++) {
                    if(chars[j]==word.charAt(i))
                        points=points+valueOfChar[j];
                }
            }
            Scores.add(points);
            ObservableList<Integer> Score = FXCollections.observableArrayList(Scores);
            score.setItems(Score);
            totalPoints=totalPoints+points;
            totalScore.setText(String.valueOf(totalPoints));
            points=0;
            textField.clear();
            str="";
        }
    }

}
