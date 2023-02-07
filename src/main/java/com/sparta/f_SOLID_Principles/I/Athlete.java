package com.sparta.f_SOLID_Principles.I;

// What we call a 'fat interface'.
// This interface must be split up into multiple interfaces.
// Therefore, swimmers don't need to implement the highJump/longJump methods ext...

public interface Athlete {
    void compete();
    void swim();
    void highJump();
    void longJump();
}
