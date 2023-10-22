public class Main {
    public static void main(String[] args) {
        LegacyNFT legacyNFT = new LegacyNFTImpl();
        NewNFT adapter = new NFTAdapter(legacyNFT);

        adapter.showNFT();
    }
}