�}�� 
 �V  �mĄ@���u
��sx�Ww2�'8i��Y���! ��5.?�1U��3"B�\r�'5�S�[�hq�Ss߹[����'�x�%;�;٠�ߵ����@���?����iW����&ʒd��;���K�ޑ��q�va�����ck0�hlD`��LE��s����X-���qN��S�欀_9�/��)��[�~��eF���v�
:�����~���r��N��q��l{�b|6�u�ơ�	}���&l/Yq �DA:�P�E�.�utJ���7ͫ
�3.S���_2�y�"�ak_��s`���b.d�I��@J���c�
"�@�l^{4��*^xA�� S-��8N�pp�60d(�-������H�d�Duj2���$�V�q+/ܵڋ���l�����Й�o�~��� ����w$Ow �3E4[G��vo�+ �n�R�4���m{�wK`���	b����h�ci��*<��e$�{�N7����Y?�=====================
 */
public interface ImageLoader extends Serializable {

    void displayImage(Activity activity, String path, ImageView imageView, int width, int height);

    void clearMemoryCache();
}
