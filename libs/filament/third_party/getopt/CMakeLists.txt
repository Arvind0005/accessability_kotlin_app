cmake_minimum_required(VERSION 3.10)
project(getopt)

set(TARGET getopt)
set(PUBLIC_HDR_DIR include)

# ==================================================================================================
# Sources and headers
# ==================================================================================================
set(PUBLIC_HDRS include/getopt/getopt.h)
set(PRIVATE_HDRS include/getopt/getopt.h)

set(SRCS
        src/getopt.c
        src/getopt_long.c)

# ==================================================================================================
# Include and target definitions
# ==================================================================================================
include_directories(${PUBLIC_HDR_DIR})

add_library(${TARGET} STATIC ${PRIVATE_HDRS} ${PUBLIC_HDRS} ${SRCS})
target_include_directories (${TARGET} PUBLIC ${PUBLIC_HDR_DIR})
