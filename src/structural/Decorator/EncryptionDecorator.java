package structural.Decorator;

import java.util.Base64;

// concrete decorator class for adding encryption feature to wrapee
public class EncryptionDecorator extends DataSourceDecorator {

     public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    // for client -> feature-encrypting normal string & write it to a file
    public void writeData(String data) {
        // data that passed first get encoded using encode()
        // then we call writeData() of wrapee using super
        // therefore, data that going to be written, will also be encrypted. (this is similar to adding enctyption behavior)
        super.writeData(encode(data));
    }

    @Override
    // for client -> feature-read enctyped data from a file and decrypt it
    public String readData() {
        return decode(super.readData());
    }

    // input -> normal string
    // output -> encoded string
    private String encode(String data) {
        byte[] result = data.getBytes();
        for (int i = 0; i < result.length; i++) {
            result[i] += (byte) 1;
        }
        return Base64.getEncoder().encodeToString(result);
    }

    // input -> encoded string
    // output -> decoded string
    private String decode(String data) {
        byte[] result = Base64.getDecoder().decode(data);
        for (int i = 0; i < result.length; i++) {
            result[i] -= (byte) 1;
        }
        return new String(result);
    }

}
