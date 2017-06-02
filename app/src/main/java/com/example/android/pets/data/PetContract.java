package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by rudi on 01.06.17.
 */

public class PetContract {

    public final static class PetEntry  implements BaseColumns{
        // Table name
        public static final String TABLE_NAME = "pets";

        // Column with the foreign key into the pets table.
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_PET_NAME = "name";
        public static final String COLUMN_PET_GENDER = "gender";
        public static final String COLUMN_PET_BREED = "breed";
        public static final String COLUMN_PET_WEIGHT = "weight";
        // Gender possible types
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
    }
}
