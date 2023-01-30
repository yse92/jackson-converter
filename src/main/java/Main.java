import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import solvd.models.*;
import solvd.util.FilePropertiesUtil;
import solvd.util.Generator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        /**
         *  Object To JSON
         */
        ObjectMapper objectMapper = new ObjectMapper();

        //Branches branches = Generator.generateBranches();
        //objectMapper.writeValue(new FileOutputStream(new FilePropertiesUtil().getPath()), branches); //OK
        /**
         * JSON To Object
         */
        //byte[] jsonData = Files.readAllBytes(Paths.get(new FilePropertiesUtil().getPath()));
        //Branches branches = objectMapper.readValue(jsonData, Branches.class);
        //System.out.println(branches);

    }
}
