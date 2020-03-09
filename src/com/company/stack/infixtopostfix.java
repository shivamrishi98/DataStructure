package com.company.stack;

import java.util.Stack;

public class infixtopostfix {

    static int prec(char c)
    {
        switch (c)
        {
            case  '+':
            case  '-':
            return 1;

            case  '/':
            case  '*':
                return 2;

            case '^':
                return 3;
        }

        return -1;
    }

    static String infixtopostfix(String str)
    {

        String res = "";

        Stack<Character> st = new Stack<>();

        for(int i=0;i<str.length();++i) {
            char c = str.charAt(i);

            if(Character.isLetterOrDigit(c))
            {
                res += c;
            } else if(c=='(')
            {
                st.push(c);
            } else if(c==')')
            {
                while (!st.isEmpty() && st.peek() !='(')
                {
                   res += st.pop();
                }
                if (!st.isEmpty() && st.peek() != '(') {
                    //     return "Invalid Expression"; // invalid expression
                } else {
                    st.pop();
                }
            } else {
                while (!st.isEmpty() && prec(c) <= prec(st.peek()))
                {
                    res += st.pop();
                }
                st.push(c);
            }

        }

        while (!st.isEmpty())
        {
            res += st.pop();
        }
        return res;
    }

    static int postfixEval(String str)
    {
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<str.length();i++)
        {
            char c = str.charAt(i);

            if(Character.isDigit(c))
            {
                st.push(c-'0');
            } else {

                int val1 = st.pop();
                int val2 = st.pop();

                switch (c)
                {
                    case '+':
                        st.push(val2+val1);
                        break;

                    case '-':
                        st.push(val2- val1);
                        break;

                    case '/':
                        st.push(val2/val1);
                        break;

                    case '*':
                        st.push(val2*val1);
                        break;
                }
            }

        }

        return st.pop();
    }



}
