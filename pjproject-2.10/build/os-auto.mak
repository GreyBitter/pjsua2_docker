# build/os-auto.mak.  Generated from os-auto.mak.in by configure.

export OS_CFLAGS   := $(CC_DEF)PJ_AUTOCONF=1  -fPIC -DPJ_IS_BIG_ENDIAN=0 -DPJ_IS_LITTLE_ENDIAN=1 -fPIC

export OS_CXXFLAGS := $(CC_DEF)PJ_AUTOCONF=1 -g -O2

export OS_LDFLAGS  :=  -lopus -lssl -lcrypto -luuid -lm -lrt -lpthread  -lasound -lSDL2  -lavdevice -lavformat -lavcodec -lswscale -lavutil -lv4l2 -lopencore-amrnb -lopencore-amrwb -lvo-amrwbenc

export OS_SOURCES  := 


