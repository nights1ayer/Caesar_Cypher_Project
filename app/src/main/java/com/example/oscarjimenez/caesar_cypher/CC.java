package com.example.oscarjimenez.caesar_cypher;

public class CC {
    String message;
    int key;
    char[] mess;
    public CC() {
        setMessage("");
    }
    public CC(String m) {
        setMessage(m);
    }
    public void setMessage(String m) {
        message = m;
        mess = new char[m.length()];
        for(int i = 0; i < m.length(); i++) {
            mess[i] = m.charAt(i);
        }
    }
    public void scramble() {
        int temp;
        message = "";
        key = (int)(Math.random() * 25 + 1);
        for(int j = 0 ; j < mess.length; j++) {
            if(mess[j] + key > 126) {
                temp = key - (126 - mess[j]);
                message += (char)(33 + temp);
            }
            else
                message += (char)(mess[j] + key);
        }
    }
    public void unScramble() {
        message = "";
        for(int k = 0; k < mess.length; k++) {
            message += mess[k];
        }
    }
    public String getMessage() {
        return message;
    }
    public int getKey() {
        return key;
    }
}

