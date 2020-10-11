package com.jtfr.chapter224;

public class PythonCourseFactory implements CourseFactory {
    public INote createNote() {
        return new PythonNote();
    }

    public IVideo createVideo() {
        return new pythonVideo();
    }
}
