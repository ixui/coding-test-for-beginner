boolean isLeap(int year) {
    if (year % 4 == 0) {
        if ((year % 100) == 0) {
            if ((year % 400) == 0) {
                // 4で割り切れる & 100で割り切れる & 400で割り切れる
                return true;
            }
        } else {
            // 4で割り切れる & 100で割り切れない
            return true;
        }
    }

    return false;
}