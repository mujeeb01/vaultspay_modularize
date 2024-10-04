package com.vaultspay.core.local.constants

import androidx.annotation.IntDef
import androidx.annotation.LongDef
import androidx.annotation.StringDef

object AppConstants {

    @StringDef(ApiConfiguration.BASE_URL)
    annotation class ApiConfiguration {
        companion object {
            const val BASE_URL = "https://jsonplaceholder.typicode.com/"
        }
    }

    @LongDef(
        SystemProperties.VIBRATION_INTERVAL
    )
    annotation class SystemProperties {
        companion object {
            const val VIBRATION_INTERVAL = 20L

        }
    }

    annotation class GenericPopupType {
        companion object {
            const val MULTIPLE_LOGIN = "1"
            const val SESSION_TIMEOUT = "2"
            const val NEW_UPDATE = "3"
            const val ERROR = "4"
            const val SYSTEM_UNDER_MAINTENANCE = "5"
            const val RESET_PASSWORD_PASSCODE = "6" //use for both reset password and passcode
            const val ENABLE_FINGERPRINT = "7"
            const val GO_BACK_GET_STARTED_SCREEN = "8"
            const val FEATURE_UNDER_MAINTENANCE = "9"
            const val ENABLE_FINGERPRINT_SETTING = "10"
            const val LOG_OUT = "11"
            const val ENABLE_FACE_ID = "12"
            const val REMOVE_CARD = "13"
            const val REMOVE_METHOD = "14"
            const val OPTIONAL_CHARGES = "15"
            const val RESET_TO_DEFAULT = "16"
            const val ROOTED_DEVICE = "17"
            const val FACING_ISSUE_GET_HELP = "18"
        }
    }

    @StringDef(DbConfiguration.DB_NAME)
    annotation class DbConfiguration {
        companion object {
            const val DB_NAME = "BaseProject"
        }
    }


    @StringDef(
        DataStore.DATA_STORE_NAME,
        DataStore.LOCALIZATION_KEY_NAME,
        DataStore.USER_NAME_KEY,
        DataStore.FIRST_TIME_LOGIN,
        DataStore.SHOW_INTRO_SCREEN,
        DataStore.API_TOKEN,
        DataStore.SHOW_INTRO_SCREEN_ENCRYPTED,
        DataStore.PASSCODE,
        DataStore.BIOMETRIC_LOGIN,
        DataStore.FIRST_TIME_LOGIN,
        DataStore.AVATAR,
        DataStore.USER_AVATAR,
        DataStore.USER_NAME,
        DataStore.USER_OBJECT,
        DataStore.APP_THEME,
    )
    annotation class DataStore {
        companion object {
            const val DATA_STORE_NAME = "vaultspay_datastore"
            const val LOCALIZATION_KEY_NAME = "app_language"
            const val USER_NAME_KEY = "user_name_key"
            const val FIRST_TIME_LOGIN = "isFirstTimeLoggingInUsingThisDevice"
            const val SHOW_INTRO_SCREEN = "isShowIntroScreen"
            const val API_TOKEN = "apiToken"
            const val USER_AVATAR = "userAvatar"
            const val USER_NAME = "userName"
            const val PASSCODE = "passcode"
            const val USER_OBJECT = "userObject"
            const val BIOMETRIC_LOGIN = "biometricLogin"
            const val AVATAR = "Avatar"
            const val SHOW_INTRO_SCREEN_ENCRYPTED = "isShowIntroScreenEncrypted"
            const val APP_THEME = "AppTheme"
        }
    }

    @IntDef(
        WithdrawAddressFieldViewType.TEXT, WithdrawAddressFieldViewType.DROP_DOWN
    )
    annotation class WithdrawAddressFieldViewType {
        companion object {
            const val TEXT = 2
            const val DROP_DOWN = 1
        }
    }


}