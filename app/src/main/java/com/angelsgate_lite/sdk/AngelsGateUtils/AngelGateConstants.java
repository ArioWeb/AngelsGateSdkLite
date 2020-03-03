

package com.angelsgate_lite.sdk.AngelsGateUtils;



public final class AngelGateConstants {

    public static String iv;
    public static String secretkey;
    public static String publicKey;
    public static int MintLengthSsalt;
    public static int MaxLengthSsalt;
    public static String SignalMethodName;
    public static String RetrofiteBaseUrl;

    private AngelGateConstants(AngelGateConstantsBuilder builder) {

        this.publicKey = builder.publicKey;
        this.iv = builder.iv;
        this.secretkey = builder.secretkey;
        this.MintLengthSsalt = builder.MintLengthSsalt;
        this.MaxLengthSsalt = builder.MaxLengthSsalt;
        this.SignalMethodName = builder.SignalMethodName;
        this.RetrofiteBaseUrl = builder.RetrofiteBaseUrl;
    }


    public static class AngelGateConstantsBuilder {

        private String iv = "";
        private String secretkey = "";
        private String publicKey = "";
        private int MintLengthSsalt = 8;
        private int MaxLengthSsalt = 9;
        public static String SignalMethodName = "signal";
        public static String RetrofiteBaseUrl = "";

        public AngelGateConstantsBuilder(String publicKey, String iv, String secretkey, String BaseUrl) {
            this.publicKey = publicKey;
            this.iv = iv;
            this.secretkey = secretkey;
            this.RetrofiteBaseUrl = BaseUrl;
        }


        public AngelGateConstantsBuilder setMintLengthSsalt(int mintLengthSsalt) {
            this.MintLengthSsalt = mintLengthSsalt;
            return this;
        }

        public AngelGateConstantsBuilder setMaxLengthSsalt(int maxLengthSsalt) {
            this.MaxLengthSsalt = maxLengthSsalt;
            return this;
        }


        public AngelGateConstants build() {
            return new AngelGateConstants(this);
        }

    }
}
