package cfvbaibai.cardfantasy.test;

import org.junit.Test;

public class CardFantasyHellTest {
    @Test
    public void Ѫ������vs��ҹħӰ() {
        TestGameBuilder.play5v5("Ѫ������", "��ҹħӰ");
    }

    @Test
    public void ����֮��vs��ҹħӰ() {
        TestGameBuilder.play5v5("����֮��", "��ҹħӰ");
    }

    @Test
    public void ����֮��vs����ո���() {
        TestGameBuilder.play5v5("����֮��", "����ո���");
    }

    @Test
    public void ���÷�ʦvs���÷�ʦ() {
        TestGameBuilder.play5v5("���÷�ʦ", "���÷�ʦ");
    }
    
    @Test
    public void ���÷�ʦvs����() {
        TestGameBuilder.play5v5("���÷�ʦ", "����");
    }
    
    @Test
    public void ����֮��vs������ʹ() {
        TestGameBuilder.play5v5("����֮��", "������ʹ");
    }}