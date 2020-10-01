FROM ubuntu
WORKDIR /opt
RUN apt update && \
    DEBIAN_FRONTEND=noninteractive \
    apt install --fix-missing libasound2-dev \
    libssl-dev libv4l-dev \
    libsdl2-dev libsdl2-gfx-dev libsdl2-image-dev \
    libsdl2-mixer-dev libsdl2-net-dev libsdl2-ttf-dev \
    libx264-dev libavformat-dev libavcodec-dev \
    libavdevice-dev libavfilter-dev libavresample-dev \
    libavutil-dev libavcodec-extra libopus-dev \
    libopencore-amrwb-dev libopencore-amrnb-dev \
    libvo-amrwbenc-dev subversion python3-pip -y
ADD pjproject-2.10 /opt/pjproject-2.10
RUN cd pjproject-2.10 \
    && export CFLAGS="$CFLAGS -fPIC" \
    && ./configure --enable-shared\
    && make dep \
    && make \
    && make install
#RUN cd pjproject-2.10/pjsip-apps/src/python/ \
#    && make \
#    && make install \
#    && python setup.py install
RUN cd pjproject-2.10/pjsip-apps/src/swig/python/ \
    && make \
    && make install \
    && python3 setup.py install
RUN rm -r pjproject-2.10
ENV LD_LIBRARY_PATH=/lib:/usr/lib:/usr/local/lib
ENTRYPOINT ["/bin/bash"]
